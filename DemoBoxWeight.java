	// This program uses inheritance to extend Box.
	class Box {
				private double  width;
				double height;
				double depth;
				Box(Box ob) { // pass object to constructor
					width = ob.width;
					height = ob.height;
					depth = ob.depth;
					}
				Box(double w, double h, double d) {
				width = w;
				height = h;
				depth = d;
				}
				Box() {
				width = -1; // use -1 to indicate
				height = -1; // an uninitialized
				depth = -1; // box
				}
				Box(double len) {
				width = height = depth = len;
				}
				double volume() {
				return width * height * depth;
				}
	}
	
	// Here, Box is extended to include weight.
	class BoxWeight extends Box {
		double weight; // weight of box
	// compute and return volume
	double volume() {
				return width * height * depth;
				}
	
	// constructor for BoxWeight
			BoxWeight(double w, double h, double d, double m) {
			super(w, h, d); // call superclass constructor
			weight = m;
					}
	}
	class DemoBoxWeight {
			public static void main(String args[]) {
			BoxWeight mybox1 = new BoxWeight(10, 20, 15, 24);
			BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
			double vol;
			vol = mybox1.volume();
			System.out.println("Volume of mybox1 is " + vol);
			System.out.println("Weight of mybox1 is " + mybox1.weight);
			System.out.println();
			vol = mybox2.volume();
			System.out.println("Volume of mybox2 is " + vol);
			System.out.println("Weight of mybox2 is " + mybox2.weight);
			}
	}
	