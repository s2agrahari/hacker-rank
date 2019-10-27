package rank;

import java.util.ArrayList;
import java.util.List;

/**
 * created by @author suraj on 27/10/19
 */
public class PageCount {

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */


        if (n == 1 || p == 1 || p == n || (n % 2 == 1 && n - 1 == p)) {
            return 0;
        }

        int pageTurnFromFront = p / 2;

        int pageTurnFromBack = n % 2 == 0 ? (p % 2 == 0) ? (((n - 1) - p) / 2) + 1 : (((n - 1) - (p - 1)) / 2) + 1 :
                (p % 2 == 0) ? ((n - 1) - p) / 2 : ((n - 1) - (p - 1)) / 2;

        return Math.min(pageTurnFromBack, pageTurnFromFront);

    }


}
