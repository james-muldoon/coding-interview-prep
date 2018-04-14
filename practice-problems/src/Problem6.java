import java.util.ArrayList;
import java.util.HashMap;

public class Problem6 {

    /*
    * Sort the letters in one word by the order they appear in another in linear time
    * Returns null if the order string doesn't contain all the letters in the target string
    * Runs in linear time, O(n+k) (lengths of the two strings)
     */

    public static String orderByString(String orderStr, String targetStr) {
        ArrayList<Character> charOrder = new ArrayList<>();

        for (char c : orderStr.toCharArray()) {
            charOrder.add(c);
        }


        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : targetStr.toCharArray()) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        StringBuilder orderedStr = new StringBuilder();
        for (Character c : charOrder) {
            if (charCounts.containsKey(c)) {
                for (int i = 0; i < charCounts.get(c); i++) {
                    orderedStr.append(c);
                    if (orderedStr.length() >= targetStr.length()) return orderedStr.toString();
                }
                charCounts.put(c, 0);
            }
        }
        return null;
    }

}
