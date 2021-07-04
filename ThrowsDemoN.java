public class ThrowsDemoN{
	
	 void show(int a, int b) throws ArithmeticException{
		int c = a/b;
		System.out.println("The division is"+c);
		//throw new ArithmeticException();
		}
	
	
	
	public static void main(String args[]){
		
	ThrowsDemoN obj1 = new ThrowsDemoN();

		obj1.show(4,2);
		try{obj1.show(4,0);}
		catch(Exception ae){}
		
		
		
		
	}
	
	
	
}