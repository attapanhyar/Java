import java.util.*;
import java.util.Collections;
class CallCons{
	ArrayList<Integer> atr = new ArrayList<Integer>();
	
	public CallCons(){
	System.out.println("Constructor Initialized");
	callthisone();
		
	}
	
	public static void callthisone(){
		System.out.println("Called from Constructor");
	}
	
	
}
public class LearningArrayList{
public static void passArray(ArrayList<Integer> myInt){
	for (int i:myInt)System.out.println(i);
	
	
}
public static void main(String args[]){
	ArrayList<Integer> myInt = new ArrayList<Integer>();
	myInt.add(3);
	myInt.add(4);
	myInt.add(5);
	
	Collections.sort(myInt);
	String conv;
	passArray(myInt);
	
	CallCons obj = new CallCons();
}


}