class ThreadDemo {
public static void main(String args[]) {
try {
	//Thread t = Thread.currentThread();
	//System.out.println(t.getName());


new NewThread("Thread 1"); // create a new thread
new NewThread("Thread 2");
//Thread t = Thread.currentThread();
//t.setPriority(10);

for(int i = 5; i > 0; i--) {

System.out.println("Main Thread: " + i);
Thread.sleep(1000);

}
} catch (InterruptedException e) {
	System.out.println("Main thread interrupted.");
}



System.out.println("Main thread exiting.");
}
}
