package Arrays;

public class BinarySearch {
    public static int binarysearch(int numbers[],int key){
        int start=0 ,end= numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid] ==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,12,45};
        int key=1;

        System.out.println("Key is at index: "+binarysearch(num,key));
    }
}
