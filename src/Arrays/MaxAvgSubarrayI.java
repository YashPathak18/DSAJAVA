package Arrays;

public class MaxAvgSubarrayI {

    public static void main(String[] args) {

        // Sample test case
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        MaxAvgSubarrayI solver = new MaxAvgSubarrayI();
        double maxAverage = solver.findMaximumAverage(nums, k);

        System.out.println(maxAverage); // Expected output: 12.75
    }

    // Sliding Window solution
    public double findMaximumAverage(int[] nums, int k) {

        int currentWindowSum = 0;

        // Build the first window
        for (int i = 0; i < k; i++) {
            currentWindowSum += nums[i];
        }

        int maximumWindowSum = currentWindowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            currentWindowSum += nums[i];        // add new element
            currentWindowSum -= nums[i - k];    // remove old element
            maximumWindowSum = Math.max(maximumWindowSum, currentWindowSum);
        }

        // Return maximum average
        return (double) maximumWindowSum / k;
    }
}
