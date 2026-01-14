class Solution {
    public static void main(String[] args) {

        public int secondLargest ( int[] nums){
            if (nums.length < 2) {
                return -1;   // not enough elements
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length; i++) {
                int curr = nums[i];

                if (curr > largest) {
                    secondLargest = largest;
                    largest = curr;
                } else if (curr < largest && curr > secondLargest) {
                    secondLargest = curr;
                }
            }

            // if secondLargest was never updated
            if (secondLargest == Integer.MIN_VALUE) {
                return -1;
            }

            return secondLargest;
        }
    }
}
