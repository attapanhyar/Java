import java.util.Comparator;
import java.util.Map;
public class FrequencyComparator implements Comparator<Integer> {
    private final Map<Integer,Integer> freqMap;
    FrequencyComparator(Map<Integer,Integer> i_freqMap) { this.freqMap = i_freqMap; }
   @Override
    public int compare(Integer k1, Integer k2) {
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));
        int valueCompare = k2.compareTo(k1);
       // If frequency is equal, then just compare by value, otherwise - compare by the frequency.
        if(freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;
    }
}