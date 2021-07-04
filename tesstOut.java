import java.io.FileOutputStream;
public class tesstOut{
	public static void main(String args[]){
	try{
		FileOutputStream f = new FileOutputStream("D:\\scripts\\test.txt");
		String s= "HEllo this very good method";
		byte[] b = s.getBytes();
		f.write(b);
		f.close();
		System.out.println("Success");
		
	}catch(Exception ae){System.out.println("Caught");}
	}	
	
	
}