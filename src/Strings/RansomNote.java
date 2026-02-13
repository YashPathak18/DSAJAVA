package Strings;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            count[ransomNote.charAt(i) - 'a']--;
            if (count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab")); // true
        System.out.println(canConstruct("aa", "ab"));  // false
    }
}
