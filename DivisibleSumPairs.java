package rank;

/**
 * created by @author suraj on 05/11/19
 */
public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {

        int possibleParis = 0;

        for (int i = 0; i < ar.length; i++) {

            for (int j = i + 1; j < ar.length; j++) {

                if ((ar[i] + ar[j]) % k == 0) {
                    possibleParis++;
                }

            }
        }

        return possibleParis;
    }

    public static void main(String[] args) {
        int count = divisibleSumPairs(6, 3, new int[]{1,3,2,6,1,2});
        System.out.println(count);
    }
}
