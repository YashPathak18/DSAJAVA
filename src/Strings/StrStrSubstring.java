package Strings;

public class StrStrSubstring {

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0)
            return 0;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            String sub = haystack.substring(i, i + m);

            if (sub.equals(needle))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "hello";
        String needle = "ll";

        int result = strStr(haystack, needle);

        System.out.println("Index found: " + result);
    }
}

