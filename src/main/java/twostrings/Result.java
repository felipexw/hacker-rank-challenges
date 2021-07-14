package twostrings;

import java.util.HashMap;
import java.util.HashSet;

public class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        final var subString1 = new HashSet<>();
        final var subString2 = new HashSet<>();

        final var s1IsGreaterThanS2 = s1.length() > s2.length();
        final var lastIndex = s1IsGreaterThanS2 ? s1.length() : s2.length();

        for (int i = 0; i <= lastIndex; i++) {
            if (i < s1.length()) {
                final var sub1 = String.valueOf(s1.charAt(i));
                if (subString2.contains(sub1))
                    return "YES";
                subString1.add(sub1);
            }
            if (i < s2.length()) {
                final var sub2 = String.valueOf(s2.charAt(i));
                if (subString1.contains(sub2))
                    return "YES";
                subString2.add(sub2);
            }
        }
        System.out.println(subString1);
        System.out.println(subString2);
        return "NO";
    }

}
