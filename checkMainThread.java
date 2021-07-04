class threading extends Thread{
	public void run(){
		
		for(int i=0;i<5;i++){
			
			System.out.println(Thread.currentThread()+ ""+i);
			try{
				
				Thread.sleep(1000);
				
			}
			catch(Exception ae){}
			
			
		}
		
		
	}
	
	
	
}

public class checkMainThread{
	
	public static void main(String args[]){
		
		threading th1 = new threading();
		threading th2 = new threading();
		System.out.println("Default Threadone Priority "+th1.getPriority());
		System.out.println("Default Thread two Priority"+th2.getPriority());
		th1.setPriority(10);
		th2.setPriority(7);
		System.out.println("Changed Threadone Priority "+th1.getPriority());
		System.out.println("Changed Thread two Priority"+th2.getPriority());
		//th1.start();
		//th2.start();
		
		
	}
	
	
	
	
}