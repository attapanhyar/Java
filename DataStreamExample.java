import java.io.FileInputStream;  
public class DataStreamExample {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\test.txt");    
            int i=5;    
            while((i=fin.read())!=-1){    //write single fin.read() and see results
             System.out.print((char)i);    
            }    
			
			
			
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  