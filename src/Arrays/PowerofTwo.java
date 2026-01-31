package Arrays;

public class PowerofTwo {

    static class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;

            while (n > 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isPowerOfTwo(1));   // true
        System.out.println(sol.isPowerOfTwo(2));   // true
        System.out.println(sol.isPowerOfTwo(16));  // true
        System.out.println(sol.isPowerOfTwo(18));  // false
        System.out.println(sol.isPowerOfTwo(0));   // false
        System.out.println(sol.isPowerOfTwo(-8));  // false
    }
}
