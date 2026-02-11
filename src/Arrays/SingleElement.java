package Arrays;

public class SingleElement {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        int result = singleNonDuplicate(nums);

        System.out.println("Single element is: " + result);
    }

    public static int singleNonDuplicate(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}

