package Strings;

public class DetectCapital {

    public static boolean detectCapitalUse(String word) {

        int upperCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }

        if (upperCount == word.length()) return true;
        if (upperCount == 0) return true;
        if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));     // true
        System.out.println(detectCapitalUse("leetcode"));// true
        System.out.println(detectCapitalUse("Google"));  // true
        System.out.println(detectCapitalUse("FlaG"));    // false
    }
}

