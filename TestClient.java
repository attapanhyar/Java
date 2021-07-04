abstract class ExtendClass{
	abstract void show1(int j);
	}

interface showing{
	public void show(int x);
	}


class Client extends ExtendClass implements Callback, showing {
		// Implement Callback's interface
		// for experiment remove public from void callback();
		public void callback(int p) {
		System.out.println("callback called with " + p);
		}
		public void show(int j){
			System.out.println("Show Method returned: "+j);
		}
		public void show1(int x){
			System.out.println("SHow1 returns "+x);
		}
}
public class TestClient{
	public static void main(String args[]){
		Client c1 = new Client();
		c1.callback(24);
		c1.show(32);
		c1.show1(2);
	}
}