package Arrays;

import java.util.Arrays;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int A = 0;
        int B = n - 1;

        while (A < B) {
            int sum = numbers[A] + numbers[B];

            if (sum == target) {
                return new int[]{A + 1, B + 1}; // 1-indexed
            } else if (sum < target) {
                A++;
            } else {
                B--;
            }
        }

        return new int[]{-1, -1}; // safety
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }
}

