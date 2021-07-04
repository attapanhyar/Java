import java.util.*;
public class newCollection{
	public static void main(String args[]){
		
		ArrayList<String> cl = new ArrayList<String>();
		cl.add("Ali");
		cl.add("1");
		
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1,"Ali");
		mp.put(2,"Ali");
		
		
		
	
	
	Iterator ir = cl.iterator();
	/*while(ir.hasNext()){
		
		System.out.println(ir.next());
	}*/
	
	for(String s:cl){
		
		System.out.println(s);
	}
	for(Map.Entry m:mp.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
	
	
	
}}