import java.util.Arrays;

class Solution {

    public void sortColors(int[] nums) {
        int start = 0;
        int middle = 0;
        int end = nums.length - 1;

        while (middle <= end) {
            if (nums[middle] == 0) {
                swap(nums, start, middle);
                start++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                swap(nums, middle, end);
                end--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 🔹 MAIN METHOD (required for IntelliJ)
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 0, 2, 1, 1, 0};
        sol.sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
}
