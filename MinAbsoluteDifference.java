package rank;

import java.util.Arrays;

/**
 * created by @author suraj on 20/10/19
 */
public class MinAbsoluteDifference {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int size = arr.length;

        int minDiff = Math.abs(arr[0] - arr[1]);

        for (int i = 1; i < size - 1; i++) {
            minDiff = Math.min(minDiff, Math.abs(arr[i] - arr[i + 1]));
        }

        return minDiff;
    }

    public static void main(String[] args) {

        System.out.println(
                minimumAbsoluteDifference(
                        new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}));
    }
}
