package Arrays;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        MajorityElementSolver solver = new MajorityElementSolver();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};   // majority = 2

        int ans = solver.majorityElement(nums);
        System.out.println("Majority Element: " + ans);
    }
}

class MajorityElementSolver {

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

