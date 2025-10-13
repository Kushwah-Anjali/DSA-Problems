package BasicHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countFrequency_Array_Element {
    public static void main(String[] args) {
        int nums[] = {  14, 1, 2, 2, 1, 3 };
    //   funtion -1 
        // i took them just for brute_Force
        // int n = nums.length;
        // brute_Force(nums,n);
 
        // funtion-2 
        // optimize_by_HashMap(nums);

        // function-3 
       System.out.println( countFrequencies(nums));
    }

    static void brute_Force(int nums[], int n) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (visited[i])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[i]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(nums[i] + " appears " + count + " times");
        }

    }

    static void optimize_by_HashMap(int arr[]) {
        HashMap<Integer, Integer> Frequency = new HashMap<>();
        for (int num : arr) {
            Frequency.put(num, Frequency.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : Frequency.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }

    }

 static List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer, Integer> Frequency = new HashMap<>();
        for (int num : nums) {
            Frequency.put(num, Frequency.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert to List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : Frequency.entrySet()) {

            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
 return result;
    }
}