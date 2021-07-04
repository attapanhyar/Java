import java.util.concurrent.*; 
public class D1Sem{
	public static void main(String args[]){
		Semaphore semaphore = new Semaphore(3);
		ExecutorService service = new Executors.newFixedThreadPool(50);
		IntStream.of(1000).forEach(i->service.execute(new Task(semaphore)));
		
		service.shutdown();
		service.awaitTermination(1, MINUTES);
		
		
	}
	static class Task implements Runnable{
	@Override
	public void run(){
		semaphore.acquire();
		semaphore.realease();
		
	}
	}
}

	
