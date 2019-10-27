package rank;

/**
 * created by @author suraj on 27/10/19
 */
public class Kangaroo {


    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {


        int startDiff = 0;
        int speedDiff = 0;
        if (x2 > x1) {
            startDiff = x2 - x1;
            speedDiff = v1 - v2;
        } else {
            startDiff = x1 - x2;
            speedDiff = v2 - v1;
        }

        if (speedDiff < 0 || startDiff < 0) {
            return "NO";
        }


        if (speedDiff == 0) {
            return "NO";
        }
        if (startDiff % speedDiff == 0) {
            return "YES";
        }


        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(kangaroo(43, 2, 70, 2));

    }
}
