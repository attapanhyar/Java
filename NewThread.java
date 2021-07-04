// Create a second thread.
class NewThread implements Runnable {
Thread t;

NewThread(String threadName) {
	
	
// Create a new, second thread
t = new Thread(this, threadName);
System.out.println("Child thread: " + t);
t.start(); // Start the thread, if not defined thread will not start
}
// This is the entry point for the second thread.
public void run() {
try {
for(int i = 6; i > 0; i--) {
System.out.println(t.getName()+"Child Thread: " + i);
t.sleep(500);
}
} catch (InterruptedException e) {
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
}
}