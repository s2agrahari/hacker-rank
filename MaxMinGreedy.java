package rank;

import java.util.Arrays;

/**
 * created by @author suraj on 24/10/19
 */
public class MaxMinGreedy {


    static int maxMin(int k, int[] arr) {

        Arrays.sort(arr);

        int max = arr[0];

        int min = arr[0];

        --k;

        for (int i = 1; i < arr.length; i++) {

            if (k > 0) {

                if (max < arr[i]) {
                    max = arr[i];
                }

                if (min > arr[i]) {
                    min = arr[i];
                }

                --k;


            } else {

                if (arr[i] < max) {
                    max = arr[i];
                }

                if (arr[i] < max && arr[i] > min) {
                    min = arr[i];
                }

            }

        }

        return max - min;

    }

    public static void main(String[] args) {
//        100
//        200
//        300
//        350
//        400
//        401
//        402
//      int arr[] = {10, 100, 300, 200, 1000, 20, 30 } ;
        int arr[] = {100, 200, 300, 350, 400, 401, 402};
        System.out.println(maxMin(3, arr));

    }
}
