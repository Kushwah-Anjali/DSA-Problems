package BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class highest_lowest_Frequency {
    public static void main(String args[]) {
        int arr[] = { 10, -2, -2, 10, -2, 10, 5 };

        System.out.println("Most Frequency element is "+  mostFrequentElement(arr));
    }

    static int mostFrequentElement(int[] nums) {
        int maxFreq = 0;
        int minElem = Integer.MAX_VALUE;

        HashMap<Integer, Integer> Freq = new HashMap<>();
        for (int num : nums) {
            Freq.put(num, Freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : Freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                minElem = entry.getKey();
            } else if (maxFreq == entry.getValue()) {
                if (entry.getKey() < minElem) {
                    minElem = entry.getKey();
                }
            }
        }
        return minElem;
    }
}
