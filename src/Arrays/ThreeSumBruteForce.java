package Arrays;

import java.util.*;

public class ThreeSumBruteForce {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        // Triple nested loops to check all combinations
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet); // sort triplet to avoid duplicates
                        set.add(triplet);          // add to set (unique only)
                    }
                }
            }
        }

        // Convert set back to list
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Call the method
        List<List<Integer>> result = threeSum(nums);

        // Print results
        System.out.println("Unique triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}