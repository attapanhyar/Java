import java.io.Console;  
class ReadPasswordTest{    
public static void main(String args[]){ 
   
//Console c=System.console();    
//System.out.println("Enter password: ");    
//char[] ch=c.readPassword();    
String text=System.console().readLine();

String pass=String.valueOf(text);//converting char array into string    
System.out.println("Password is: "+pass);    
}    
}  