package TwoDArray;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ top row (left → right)
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // 2️⃣ right column (top → bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // 3️⃣ bottom row (right → left)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            // 4️⃣ left column (bottom → top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}

