package BasicHashing;
import java.util.*;

public class countFrequency_Array_Element {
    public static void main(String[] args) {
        int nums[] = {16,1, 2, 2, 1, 3};
        List<int[]> result = frequency(nums);

        // Print the result
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }

    static List<int[]> frequency(int arr[]) {
        // Step 1: Count frequencies
        // HashMap<Integer, Integer> map = new HashMap<>();
Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Convert map into list of [key, value] pairs
        List<int[]> output = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            output.add(new int[]{entry.getKey(), entry.getValue()});
        }

        return output;
    }
}
