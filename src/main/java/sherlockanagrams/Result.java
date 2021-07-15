package sherlockanagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

     static Boolean hasDuplicate(String s) {
        final var arr = new ArrayList<String>();
        for (var i = 0; i < s.length(); i++) {
            arr.add(String.valueOf(s.charAt(i)));
        }

        var repeatedCounter = 0;
        for (var i = 0; i < arr.size(); i++) {
            for (var j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i).equals(arr.get(j))) {
                    repeatedCounter++;
                }
            }
        }

        return repeatedCounter > 0;
    }

     static int sherlockAndAnagrams(String s) {
//        if (hasDuplicate(s))
//            return 0;

        var anagramsCount = 0;

        var arr = getAllSubstrings(s);

        for (var i = 0; i < arr.size(); i++) {
            anagramsCount += countAnagrams(i, arr);
        }

        return anagramsCount;
    }

    static List<String> getAllSubstrings(final String str) {
        final var result = new ArrayList<String>();

        for (var i = 0; i < str.length(); i++) {
            for (var j = i + 1; j < str.length() + 1; j++) {
                result.add(str.substring(i, j));
            }
        }
        return result;
    }

    static Boolean isAnagram(String str1, String str2) {
        final var hist = new HashMap<String, Integer>();

        for (var i = 0; i < str1.length(); i++) {
            final var character = String.valueOf(str1.charAt(i));
            if (hist.containsKey(character)) {
                hist.put(character, hist.get(character) + 1);
            } else {
                hist.put(character, 1);
            }
        }

        for (var j = 0; j < str2.length(); j++) {
            final var character = String.valueOf(str2.charAt(j));
            if (!hist.containsKey(character))
                return false;
            hist.put(character, hist.get(character) - 1);
        }

        return true;
    }

    static Integer countAnagrams(Integer currentIndex, List<String> arr) {
        final var currentElement = arr.get(currentIndex);
        final var arrRest = arr.subList(currentIndex + 1, arr.size());
        var counter = 0;

        for (var i = 0; i < arrRest.size(); i++) {
            if (currentElement.length() == arrRest.get(i).length() && isAnagram(currentElement, arrRest.get(i))) {
                counter++;
            }
        }

        return counter;
    }

}