class MyAnimal{
private String species;
private String size;
public MyAnimal(String species, String size){
	this.species=species;
	this.size=size;
	
}
public String getSpecies(){
	return species;
}
public String getSize(){
	return size;
}
public String getSound(){
	return "";
}

}

class BeeCounter extends MyAnimal{
	public BeeCounter(String species,String size){
		super(species,size);
		
	}
	
	public String getSound(){
	return "The Sound is Zzz..";
}	
	
	public static int countBee(MyAnimal[] vlist){
		int count=0;
		boolean isList = false;
		for (MyAnimal lst:vlist){
			isList = MyAnimal.class.isAssignableFrom(lst);
			System.out.println(isList);
			if (isList){
				count++;
				isList=false;
			}
			}
			return count;
		}
	
	
}

public class ChkAnimal{
	public static void main(String args[]){
		
		MyAnimal an = new MyAnimal("DOg","3");
		BeeCounter bc = new BeeCounter("Bee","3");
		MyAnimal[] m;
		/*m.add(an);
		m.add(bc);
		int counter = bc.countBee(m);
		System.out.println(counter);
		*/
		String r1 = bc.getSound();
		System.out.println(r1);
	}
	
	
}