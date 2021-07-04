class multi3 implements Runnable{
	public void run(){
		System.out.println("Thread is implemented using Runnable...!");
		
		
		
		
	}
	
	public static void main(String args[]){
		
		multi3 m1 = new multi3();
		Thread t1 = new Thread(m1);
		t1.start();
		System.out.println(t1.isAlive());
		
		
	}
	
	
	
	
	
}