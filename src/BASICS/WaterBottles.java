package BASICS;

public class WaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {

        int totalDrunk = 0;
        int empty = 0;

        while (numBottles > 0) {
            totalDrunk += numBottles;
            empty += numBottles;

            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }

        return totalDrunk;
    }

    public static void main(String[] args) {
        int numBottles = 6;
        int numExchange = 2;

        int result = numWaterBottles(numBottles, numExchange);
        System.out.println("Total bottles drunk = " + result);
    }
}
