// Declaring an Arraylist
//Advantages of an Arraylist ovar Array
// Disadvantages of an Arrayslist ovar an array
// Adding values to an Arraylist
// Removing values from an Arraylist.
// traversing through Iterator and foreach loop



import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Allama Iqbal");//Adding object in arraylist  
  list.add("Sain GM Sayyed");  
  list.add("Dr. AK Baloch");  
  list.add("Ahmed");
  list.add("Nasir");
  list.remove("Ahmed");
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  // you can also use foreach loop
  while(itr.hasNext()){  
   System.out.println(itr.next());  
 
  }
//  int j[]= {0,1,2,3,4};
 /* String s="";
  for(String jamali:list)System.out.println(jamali);*/
  
  
  
int i[]={1,3};
for (int j=i.length-1;j>=0;j--)list.remove(i[j]);
   System.out.println("===============After Removal==============");  
  itr=list.iterator();  // you can also use foreach loop
  while(itr.hasNext()){  
   System.out.println(itr.next());  
 }  
 }
}  