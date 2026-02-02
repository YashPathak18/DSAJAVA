package TwoDArray;

import java.util.Scanner;

public class BasicOpeartions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ Matrix creation using memory allocation
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // 2️⃣ Taking matrix input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 3️⃣ Search operation
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 4️⃣ Traverse matrix once for all operations
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // search
                if (matrix[i][j] == target) {
                    found = true;
                }

                // largest
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

                // smallest
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        // 5️⃣ Output
        if (found) {
            System.out.println("Element " + target + " found in matrix");
        } else {
            System.out.println("Element " + target + " not found in matrix");
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);

        sc.close();
    }
}
