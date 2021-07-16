import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        int[] ar = new int[] {4,9999,2,2,9999,4,4,4};
       Map<Integer,Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for(int current : ar) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            output.add(current);
        }
        FrequencyComparator comp = new FrequencyComparator(map);
        Collections.sort(output, comp);
        for(Integer i : output){
        System.out.print(i + " ");
        }
    }
}
