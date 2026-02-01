package Sorting;

class CountingSort {

    public static void countingSort(int[] arr) {
        int n = arr.length;

        // 1️⃣ Find largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // 2️⃣ Create count array
        int[] count = new int[largest + 1];

        // 3️⃣ Store frequency
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // 4️⃣ Rebuild sorted array
        int j = 0;
        for (int i = 0; i <= largest; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 3, 2, 1};
        countingSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

