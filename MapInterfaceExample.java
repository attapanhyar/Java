// Hash MAP introduction
// Declaring HashMAP
// Key, value Relationship
// Travesring through HashMap


import java.util.*;  
class MapInterfaceExample{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Ali");  
  map.put(100,"Ahmed");  
  map.put(101,"Ahmed");  
  map.put(102,"Naagin");  
 // map.remove(100);
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  