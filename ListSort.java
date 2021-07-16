import java.util.*;

public class ListSort
{
    public static void main(String args[])
    {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);al.add(9999);al.add(2);
		al.add(2);al.add(9999);al.add(4);
		al.add(4);al.add(4);
		// Iterator<Integer> itr = al.iterator();
		// while(itr.hasNext()){
			// int element = itr.next();
			// System.out.print(element+" ");
			
		// }
		for (int v:al){
			System.out.print(v+" ");
		}
		Comparator<Integer> r = Collections.reverseOrder();
		int freq = Collections.frequency(al, 99);
		System.out.print("List sorted in reverse: "+freq);
		// for(int i : al)
		// System.out.print(i+ " ");
			
	}
}