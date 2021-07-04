class A {
			private void meth() {
			System.out.println("This is a final method.");
			}
}
class B extends A {
			/*void meth() { // ERROR! Can't override.
			System.out.println("Illegal!");
			}*/
			public void show(){
							
			}
			
			
}
class FinalDemo
	
	public static void main(String args[])
	{
	B b1 = new B();
	b1.show();
		
	}
	
	
	
}