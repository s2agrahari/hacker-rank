package rank;

import java.util.HashMap;
import java.util.Map;

/**
 * created by @author suraj on 21/10/19
 */
public class GOT1 {

    static String gameOfThrones(String s) {

        Map<String, Integer> charCount = new HashMap<>();

        for (String chr : s.split("")) {
            charCount.merge(chr, 1, Integer::sum);
        }

        Integer oddCount = 0;

        for (Integer count : charCount.values()) {

            if (count % 2 != 0) {
                oddCount += 1;
            }
        }

        return oddCount > 1? "NO": "YES";

    }


    public static void main(String[] args) {
        System.out.println(gameOfThrones("cdefghmnopqrstuvw"));
    }
}
