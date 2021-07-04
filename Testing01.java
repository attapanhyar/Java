interface TestingInterface{
	
	int x =10;
	double y = 12.3;
	
	public void test1();
	public void test2();
	
	
	
}


class TestingInterface01 implements TestingInterface{
	
	
	public  void test1(){
		
		System.out.println("Testing 01 Methode");
		
		
	}
		public  void test2(){
		
		System.out.println("Testing 02 Methode");
				
	}
	
	
	
	
	public static void main(String args[]){
		TestingInterface01 t1 = new TestingInterface01();
		t1.test1();
		t1.test2();
		System.out.println("The value x "+t1.x);
		
		
		
		
	}
	
	
	
	
}