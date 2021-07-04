import java.io.*;
public class readFromConsole{
	public static void main(String args[]){
		//String line = System.console().readLine();
		String name="", password="";
		System.out.println("Enter the User Name:");
		name = System.console().readLine();
		System.out.println("Enter the Password:");
		char[] pass1 =System.console().readPassword();
		System.out.println("Please renter the Password:");
		char[] pass2 =System.console().readPassword();
		String ps1="", ps2="";
		for(int i=0;i<pass1.length;i++)	ps1=ps1+pass1[i];
		for(int i=0;i<pass2.length;i++)	ps2=ps2+pass2[i];
		if(ps1.equals(ps2)){
			password = ps1;
			System.out.println("Password successfully set.");
			System.out.println("==========================");
			System.out.println("Credential Details are .");
			System.out.println("ID =: "+name);
			System.out.println("Password =: "+password);
			
		}else{
			
			System.out.println("Password did not Match.");
			
		}
		
	
	
}



}