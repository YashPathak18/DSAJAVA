class Solution {
    public void moveZeroes(int[] nums) {
        int A = 0;

        // Phase 1: move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[A] = nums[i];
                A++;
            }
        }

        // Phase 2: fill remaining positions with zero
        for (int i = A; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
