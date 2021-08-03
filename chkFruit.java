import java.util.ArrayList;
import java.util.*;
class Fruit{
	String Name;
	String Season;
	public Fruit(String Name, String Season){
	this.Name=Name;
	this.Season=Season;
	//System.out.println("Fruite");
	}
	public String getName(){
		return this.Name;
	}

}
class Banana extends Fruit{
	int length;
	public Banana(String name, String season, int length){
		super(name, season);
		this.length=length;
	}
}


public class chkFruit{
	public static void main(String args[]){
	ArrayList<Banana> banana = new ArrayList<Banana>();
	banana.add(new Banana("Banana1","New Seas",13));
	
	
	}


}