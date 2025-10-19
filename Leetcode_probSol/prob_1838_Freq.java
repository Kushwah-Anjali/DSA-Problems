public class prob_1838_Freq {
    public static void main(String args[]) {
        int nums[] = { 1, 8, 2, 5, };
        // int k = 5;
        // maxFrequency(arr, k);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = temp;

            }

        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
// static int maxFrequency(int[] nums, int k) {
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] > max) {
// int temp = max;
// max = nums[i];
// nums[i] = temp;
// }
// }
// }
