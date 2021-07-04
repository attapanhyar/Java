// Consept of Set 
// Difference between Set and Arraylist
// Declaring HashSET Collection
// adding values to HashSET
// removing values to hashSET


import java.util.*;  
class HashsetExample{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<>();  
  set.add("Ali");  
  set.add("Ahmed");  
  set.add("Farz");  
  set.add("Nafees");  
  set.add("Nafees");  
  set.remove("Nafees");
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  



//for(int i =0:4)