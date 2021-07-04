import java.io.*;
public class ReadExample {  
  public static void main(String[] args) throws IOException {  
    byte[] buf = { 35, 36, 37, 38 };  
    // Create the new byte array input stream  
    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
    int k = 0;  
    while ((k = byt.read()) != -1) {  
      //Conversion of a byte into character  
      char ch = (char) k;  
      System.out.print("ASCII value of Character is:" + k );
	  System.out.println("; and Special character is: " + ch);  
    }  
  }  
}  