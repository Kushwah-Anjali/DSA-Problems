import java.util.Arrays;

public class prob_1838_Freq {
    public static void main(String args[]) {
        int nums[] = { 1,2,4 };
        int k = 5;
 System.out.println(       maxFrequency(nums, k));
    }

    static int maxFrequency(int[] nums, int k) {
       Arrays.sort(nums);

        long sum = 0;
        int left = 0;
        int res = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while ((right - left + 1) * (long) nums[right] - sum > k) {
                sum -= nums[left];
                left++;
            }
           
            res = Math.max(res, right - left + 1);
        }
        // update max frequency


        return res;
    }
}