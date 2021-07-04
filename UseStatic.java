// Demonstrate static variables, methods, and blocks.
class UseStatic {
static int a = 4;
static int b;
static void meth(int x) {
	System.out.println("x = " + x);
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	}

public void show()
{
	System.out.println(a);
	
}

public static void main(String args[]) {
		//donotrun();
		UseStatic u1 = new UseStatic();
		UseStatic u2 = new UseStatic();
		UseStatic u3 = new UseStatic();
		//meth(42);
		u1.a=1;
		u1.show();
		u2.a=2;
		u1.show();
		u3.a=3;
		u1.show();
		
		
}
}