package Sorting;

class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // element to be inserted
            int j = i - 1;

            // shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 7, 55, 22};
        insertionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

