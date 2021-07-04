public class ExHandling{
	
	public static void main(String args[]){
		
		int x = 2, y=0;
		float ft = 0.002f;
		double z;
		
		try{
			System.out.println("Not Caught");
			z=x/y;
			System.out.println("tHIS WON'T be printed");
		}
		
		catch(Exception ae){
			
			System.out.println("Caught"+ae);
			
		}
		finally
		{
			System.out.println("Exiting the program");
		}
		
		
		
	}
	
	
	
	
	
}