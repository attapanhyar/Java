// A Simple demonstration of abstract.
 abstract class A {
 public void test1(){}
abstract public void test2();
abstract public void test3();
				

  }
  
  
public class AbstractDemo extends A{
	
	public void test1(){
		
		System.out.println("This is test01");
		
	}
	
	public void test2(){
		
		System.out.println("This is test02");
		
	}
	
	public void test3(){
		
		System.out.println("This is test03");
		
	}
	
	
	public static void main(String args[]){
		
		AbstractDemo obj = new AbstractDemo();
		obj.test1();
		obj.test2();
		obj.test3();
		
	}
	
	
	
}