public class DeamonThread extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			
			System.out.println("Deamon Thread");
		}
		else{
			System.out.println("USer Thread");
			
		}
				
	}
	public static void main(String args[]){
		DeamonThread d1 = new DeamonThread();
		DeamonThread d2 = new DeamonThread();
		DeamonThread d3 = new DeamonThread();
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		
		
	}
	
	
	
}