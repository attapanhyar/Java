class MethodTest{
	private int x, y;
	public void setValues(int x, int y){
	this.x=x;
	this.y =y;
	}
	public int getX(){
	return x;
	}
	public int prod()
	{
	return x*y;
	}
}
class MethodCall{
	public static void main(String args[]){
		
		int prod;
		MethodTest M1, M2;
		M1 = new MethodTest();
		//M1.x=5; M1.y=3;
		M1.setValues(2,3);
		prod = M1.prod();
		System.out.println("The value of x for M1 is : "+M1.getX());
		System.out.println(prod);
	}
	
	
	
	
}