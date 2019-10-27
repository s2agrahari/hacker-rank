package rank;

import java.util.ArrayList;
import java.util.List;

/**
 * created by @author suraj on 27/10/19
 */
public class BetweenTwoSets {


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        a.sort(Integer::compareTo);
        b.sort(Integer::compareTo);

        int hcf = hcfOfAllNumbers(b);
        int lastElementOfA = a.get(a.size() - 1);

        List<Integer> expectedPossibleList = new ArrayList<>();

        for (int i = lastElementOfA; i <= hcf; i++) {
            boolean isFactor = true;
            for (int aElem : a) {

                if (i % aElem != 0 || hcf % i != 0) {
                    isFactor = false;
                    break;
                }
            }
            if (isFactor) {
                expectedPossibleList.add(i);
            }
        }

        return expectedPossibleList.size();
    }


    public static int hcfOfAllNumbers(List<Integer> arr) {
        int hcf = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            hcf = hcf(lowest(hcf, arr.get(i)), arr.get(i));
        }

        return hcf;
    }

    public static int lowest(int a, int b) {
        return Math.min(a, b);
    }

    public static int hcf(int lowest, int highest) {

        if (highest % lowest == 0) {
            return lowest;
        }

        return hcf(highest % lowest, lowest);
    }

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(72);
        b.add(48);

        System.out.println(getTotalX(a, b));


    }
}
