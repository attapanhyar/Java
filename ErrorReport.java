public class ErrorReport{
	
	public static void main(String args[]){
		
		System.err.println("Error Message");
		try{int i=System.in.read();
		System.out.println((char)i);}
		catch(Exception ae){}
		
		
	}
	
	
	
}