class multiSleep extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println("Thread is Running...!"+Thread.currentThread());
		try{Thread.sleep(1000);}catch(Exception ae){}
		
		}
		
	}
	
	public static void main(String args[]){
		
		multiSleep s1 = new multiSleep();
		s1.setName("First Thread");
		s1.start();
		//s1.start(); We can not start a thread twice
		multiSleep s2 = new multiSleep();
		s2.start();
		s2.setName("Second Thread");
	}
	
	
}