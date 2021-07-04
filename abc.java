 class add
{
	int num1=10;
	int num2=20;
	void sum()
	{
		System.out.println("value of num1 is="+num1);
		System.out.println("value of num1 is="+num2);
		System.out.println("sum is="+(num1+num2));
	}
	void sub()
	{
		
		System.out.println("value of num1 is="+num1);
		System.out.println("value of num1 is="+num2);
		System.out.println("sub is="+(num1-num2));
	}
}
	public class abc
	{
		public static void main(String args[])
		{
			add ob1=new add();
			/*ob1.sum();
			ob1.sub();*/
			ob1.num1=50;
			ob1.num2=90;
		}
	}
	
		