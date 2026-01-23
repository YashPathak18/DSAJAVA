package Arrays;

import java.util.*;

public class ContainerWithMostWater1 {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int area = width * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = maxArea(height);
        System.out.println("Maximum water container area: " + result);
    }
}
