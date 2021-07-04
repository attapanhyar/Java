import java.io.*;    
class Input1{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("D:\\scripts\\test.txt");    
   FileInputStream fin2=new FileInputStream("D:\\scripts\\input.txt");    
   FileOutputStream fout=new FileOutputStream("D:\\scripts\\output.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i= sis.read();    
   while(i!=-1)    
   {    
     fout.write(i);        
	 i = sis.read();
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}    