import java.io.*;  
public class BufferedWriterExample {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\scripts\\test.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to AOOP.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  