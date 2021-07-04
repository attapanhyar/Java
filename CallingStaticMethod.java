interface firstInterface{
	public void meth1();
	public void meth2();
	
	
}




abstract class parent{
	final void meth1(){
		
		System.out.println("Final Method");
	}
	abstract void absMeth();
	
	
	
}

abstract class child2 extends parent{
	
	
}
public class CallingStaticMethod extends parent{
	
	void absMeth(){
		
	}
	
	public static void main(String args[]){
		
	CallingStaticMethod obj1= new CallingStaticMethod();
	obj1.meth1();
		
		
	}
	
	
	
}