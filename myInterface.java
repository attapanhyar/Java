
			
 interface myInterface{
	
	int x = 10;
	
	public void test1();
	public void test2();
	public void test3();	}
	
	/// Interface02
	interface myInterface2{
	
	int x1 = 10;
	
	public void test1();
	public void test2();
	public void test3();	}

	
	
	
	///
	
	class ImpInterface implements myInterface,myInterface2{
		public void test1()
		{
			
		System.out.println("Testing 01 ");
		}
		public	void test2()
		{
			
		System.out.println("Testing 02 ");
			
			
		}
		public void test3()
		{
			
		System.out.println("Testing 02 ");
		}
		
		
		public static void main(String args[]){
			
			ImpInterface obj = new ImpInterface();
			obj.test1();
			//obj.x=12;
			System.out.println(obj.x);
		}
	}
			
		
	
	
	
	class ImpInterface02 implements myInterface{
		public void test1()
		{
			
		System.out.println("Testing 01 ");
		}
			public	void test2()
		{
			
		System.out.println("Testing 02 ");
			
			
		}
		public void test3()
		{
			
		System.out.println("Testing 02 ");
		}
		public void test4(){
			System.out.println("Testing 04 ");
				}
			
	}	
	
	
	