// BoxWeight now uses super to initialize its Box attributes.
class BoxWeight extends Box {
double weight; // weight of box
// initialize width, height, and depth using super()
BoxWeight(double w, double h, double d, double m) {
super(w, h, d); // call superclass constructor
weight = m;
}
}
class DemoBoxWeightSuper {
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