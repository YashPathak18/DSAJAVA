package Strings;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        int[] freq = new int[128]; // ASCII lookup

        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            freq[c]++;
        }

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (freq[c] > 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println(numJewelsInStones("z", "ZZ")); // 0
    }
}

