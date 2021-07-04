class multi extends Thread{
	public void run(){
		
		System.out.println("Thread is Running...!");
		
	}
	
	public static void main(String args[]){
		
		multi t1 = new multi();
		t1.start();
		try{
		t1.sleep(1000);}catch(Exception ae){}
		System.out.println(t1.isAlive());
	}
	
	
}