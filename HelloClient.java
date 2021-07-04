import java.rmi.RMISecurityManager; 
import java.rmi.Naming; 
import java.rmi.RemoteException;
public class HelloClient 
{ 
    public static void main(String arg[]) 
    { 
        String message = "blank";

        // I download server's stubs ==> must set a SecurityManager 
        System.setSecurityManager(new RMISecurityManager());
		String url = "rmi://127.0.0.1:1099/HelloImpl";
        try 
        { 
           Hello obj = (Hello) Naming.lookup(url);         //objectname in registry 
           System.out.println(obj.sayHello()); 
        } 
        catch (Exception e) 
        { 
           System.out.println("HelloClient exception: " + e.getMessage()); 
           e.printStackTrace(); 
        } 
    } 
} 