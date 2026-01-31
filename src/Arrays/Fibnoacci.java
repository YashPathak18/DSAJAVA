package Arrays;

public class Fibnoacci {

    static class Solution {
        public int fib(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;

            int prev2 = 0; // F(0)
            int prev1 = 1; // F(1)

            for (int i = 2; i <= n; i++) {
                int current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }
            return prev1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.fib(0)); // 0
        System.out.println(sol.fib(1)); // 1
        System.out.println(sol.fib(2)); // 1
        System.out.println(sol.fib(3)); // 2
        System.out.println(sol.fib(5)); // 5
        System.out.println(sol.fib(10)); // 55
    }
}
