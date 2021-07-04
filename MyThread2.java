class MyThread2 implements Runnable{
	
	public void run(){
		
		for(int i=0;i<5;i++){
			
			System.out.println(i);
			try{
				Thread.sleep(1000);
				
			}catch(Exception ae){}
			
		}
		
		
		
	}
	
	public static void main(String args[]){
		
		MyThread2 m1 = new MyThread2();
		MyThread2 m2 = new MyThread2();
		Thread t1 = new Thread(m1);
		t1.setName("Tiger 1");
		System.out.println(t1.getName());
		
		Thread t2 = new Thread(m2);
		t2.setName("Jamali 2");
		System.out.println(t2.getName());
		//t1.start();
	//	t2.start();
		
		
	}
	
	
	
	
}