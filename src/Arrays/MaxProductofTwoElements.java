package Arrays;

import java.util.*;

public class MaxProductofTwoElements {
    public static void main(String[] args) {

        MaxProductSolver solver = new MaxProductSolver();

        int[] nums = {3, 4, 5, 2};

        int result = solver.maxProduct(nums);
        System.out.println("Max Product = " + result);  // expected: 12
    }
}

class MaxProductSolver {

    public int maxProduct(int[] nums) {

        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {

            if (num > max1) {
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
