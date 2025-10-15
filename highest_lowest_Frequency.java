package BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class highest_lowest_Frequency {
    public static void main(String args[]) {
        int arr[] = { 10, 2, 10, 2, 10, 5 };

        Frequency(arr);
    }

    static void Frequency(int arr[]) {
        int max = Integer.MIN_VALUE;
        int maxElem = 0;
        int min = Integer.MAX_VALUE;
        int minElem = 0;
        HashMap<Integer, Integer> Freq = new HashMap<>();
        for (int num : arr) {
            Freq.put(num, Freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : Freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxElem = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                minElem = entry.getKey();
            }

        }
        System.out.println("Max: " + maxElem + " appears " + max);
        System.out.println("Min: " + minElem + " appears " + min);

    }
}
