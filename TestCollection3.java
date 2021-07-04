import java.io.*;
import java.util.*;  
public class TestCollection3{  
 public static void main(String args[]){  
  //Creating user-defined class objects  
  Scanner sc =  new Scanner(System.in);
  System.out.println("Enter the ID of Student");
  int IDc = sc.nextInt();
  System.out.println("Enter the Name of Student");
  String Name = sc.next();
  System.out.println("Enter the Roll No of Student");
  int Rol = sc.nextInt();
  Student s1=new Student(IDc,Name,Rol);  
  //creating arraylist  
  ArrayList<Student> al=new ArrayList<Student>();  
  al.add(s1);//adding Student class object  
  //Getting Iterator  
  Iterator itr=al.iterator();  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }
  /////////////////////////////////////////////////////
  // Read From File in my case it is saved in D:\scripts
  FileReader fr;
	BufferedReader br;
	
	try{
			fr=new FileReader("D:\\scripts\\test.txt");    
			br = new BufferedReader(fr);
			String line = br.readLine();
			String [] s;
			String name ="";
			int id=0;
			int rollno=0;
			
			
          while(line!=null)    {
			  s = line.split(",");
			  id = Integer.parseInt(s[0]);
			  name = s[1];
			  rollno = Integer.parseInt(s[2]);
			  System.out.println("=============================================");
			  System.out.println("ID = "+id+"\n Name : "+name+"\n Roll No."+rollno);
			  
			  line = br.readLine();
			  
		  }
	br.close();
	fr.close();  }catch(IOException ae){System.out.println("Exception Caught"+ae);}
	
	  
	  
  }
  
	
 } 
 
