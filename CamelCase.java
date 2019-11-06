package rank;

import java.util.Arrays;

/**
 * created by @author suraj on 05/11/19
 */
public class CamelCase {

    static int camelcase(String s) {
        int count = s.split("[A-Z]").length;

        char lastCharacter = s.charAt(s.length() - 1);

        if (count > 0 && (lastCharacter >= 65 && lastCharacter <= 90)) {
            count++;
        }
        return count;
    }
}
