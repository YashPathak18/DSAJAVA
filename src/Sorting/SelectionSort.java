package Sorting;

class SelectionSort {
    public static void selectinonSort(int[]arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex =j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]= temp;

        }

    }

    public static void main(String[] args) {
        int[]arr={5,2,6,8,7,55,22};
        selectinonSort(arr);

        for(int x : arr){
            System.out.println(x+" ");
        }
    }
}
