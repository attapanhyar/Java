class Overloading{
	private int x,y;
Overloading()	// Constructor
{
	System.out.println("One Object is initialized");
}
Overloading(int a, int b)
{
	x = a;
	y = b;
	System.out.println("The new value of X is :"+x);
	System.out.println("The new value of Y is :"+y);
}	
}

public class OverlaodingTest{
	public static void main(String args[]){
		
		int x=10;
		System.out.println("The value of X before casting is: "+x);
		double d,d1 = 2.0000;
		d = x;
		x = (int)d1;
		System.out.println("The value of X After casting is: "+x);
		
				
	}
	
	
	
}