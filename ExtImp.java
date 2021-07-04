abstract class abst01{
	
	abstract void meth1();
	abstract void meth2();
	abstract void meth3();
	 void meth4(){}
	
	
	
}

interface int01{
	public void meth1();
	public void meth2();
	public void meth3();
	public void meth4();
	
	}
	
	
	public class ExtImp extends abst01 implements int01{
		public void meth1(){System.out.println("Hello");}
		public void meth2(){System.out.println("Hello2");}
		public void meth3(){System.out.println("Hello3");}
		public void meth4(){System.out.println("Hello4");}
		
		public static void main(String args[])
		{
			ExtImp obj = new ExtImp();
			
			
			
			
			
		}
		
		
		
	}