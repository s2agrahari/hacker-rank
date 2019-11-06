/*
package rank;

*/
/**
 * created by @author suraj on 05/11/19
 *//*

public class TwoString {

    static int max = Integer.MIN_VALUE;

    static int alternate(String s) {

        int i = 0;
        while (i < s.length()) {
            performAlgo(s, i);
            i++;
        }

        return Math.max(max, 0);

    }

    static void performAlgo(String s, int pos) {

        if (s.length() == 1) {
            max = Math.max(max, s.length());
            return;
        }

        if (checkIsAlternating(s)) {
            max = Math.max(max, s.length());
        }

        if (pos > s.length() - 1) {
            return;
        }
        s = s.replaceAll((s.charAt(pos) + ""), "");

        performAlgo(s, pos);
    }

    static boolean checkIsAlternating(String s) {

        if (s.length() == 1) {
            return true;
        }

        if (s.length() == 2) {
            return s.charAt(0) == s.charAt((1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i) != s.charAt(i + 2)) {
                return false;
            }
        }
        return true;

    }

}
*/
