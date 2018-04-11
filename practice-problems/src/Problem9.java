import java.util.HashSet;
import java.util.Set;

/*
    * Given a string, find the first recurring character
    * e.g. the string "barnacle" should return 'a'.
    * If no recurring characters are found, the function should return null
 */
public class Problem9 {

    public static Character getFirstRecurringChar(String s) {
        Set<Character> charsSeen = new HashSet<>();

        char[] stringChars = s.toCharArray();
        for (char c : stringChars) {
            if (charsSeen.contains(c)) {
                return c;
            }
            charsSeen.add(c);
        }

        return null;
    }

}
