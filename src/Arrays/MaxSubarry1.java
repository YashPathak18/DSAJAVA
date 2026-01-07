package Arrays;

public class MaxSubarry1 {
    public static void maxsum(int numbers[]){
        int MaxSum= Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++) {
                int CurrSum=0;
                for (int k = i; k <= j; k++) {
                    CurrSum += numbers[k];
                }
                if (CurrSum > MaxSum) {
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("Max Sum  : "+MaxSum);
    }


    public static void main(String[] args) {
        int numbers[] ={2,4,60,8,10,100};
        maxsum(numbers);


    }
}
