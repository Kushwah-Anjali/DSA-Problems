package BasicHashing;

import java.util.HashMap;

import java.util.Map;

public class countFrequency_Array_Element {
    public static void main(String[] args) {
        int nums[] = {16, 14, 1, 2, 2, 1, 3 };

        // i took them just for brute_Force
        // int n = nums.length;
        // brute_Force(nums,n);

        optimize_by_HashMap(nums);
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
}