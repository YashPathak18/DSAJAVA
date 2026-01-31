package BASICS;

public class Tribonacci {

    static class Solution {
        public int tribonacci(int n) {
            if (n == 0) return 0;
            if (n == 1 || n == 2) return 1;

            int a = 0; // T0
            int b = 1; // T1
            int c = 1; // T2

            for (int i = 3; i <= n; i++) {
                int next = a + b + c; // Ti
                a = b;
                b = c;
                c = next;
            }
            return c; // Tn
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.tribonacci(0));  // 0
        System.out.println(sol.tribonacci(1));  // 1
        System.out.println(sol.tribonacci(2));  // 1
        System.out.println(sol.tribonacci(3));  // 2
        System.out.println(sol.tribonacci(4));  // 4
        System.out.println(sol.tribonacci(10)); // 149
    }
}

