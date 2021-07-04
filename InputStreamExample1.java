import java.io.*;  
class InputStreamExample1 {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("D:\\scripts\\test.txt");    
   FileInputStream input2=new FileInputStream("D:\\scripts\\input.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}