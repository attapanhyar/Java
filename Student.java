import java.io.*;
class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
   String s=rollno+","+name+","+age;
   FileWriter fr;
   BufferedWriter br;
   PrintWriter pr;
   try{
	   fr = new FileWriter("D:\\scripts\\test.txt",true);
	   br = new BufferedWriter(fr);
	   pr = new PrintWriter(br);
	   pr.println(s);
	   pr.close();
	   br.close();
	   fr.close();
	   	   
   }catch(IOException ae){
	   
	   
   }
  }  
} 