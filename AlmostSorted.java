package rank;

import java.util.Scanner;

/**
 * created by @author suraj on 13/11/19
 */
public class AlmostSorted {

    private static final Scanner scanner = new Scanner(System.in);

    static void almostSorted(int[] arr) {


        int swapCount = 0;

        int swapI = -1;
        int swapJ = -1;

        int reverseL = -1;

        int reverseR = -1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                reverseR = i + 1;
                swapCount += 1;
                if (swapCount == 1) {
                    swapI = i;
                    reverseL = i;
                    swapJ = i + 1;
                }
            }
        }

        if (swapCount == 0) {
            System.out.println("yes");
        } else if (swapCount == 1) {
            System.out.println("yes");
            System.out.println("swap " + (swapI + 1) + " " + (swapJ + 1));
        } else if (reverseR != -1) {
            System.out.println("yes");
            System.out.println("reverse " + (reverseL + 1) + " " + (reverseR + 1));
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        almostSorted(arr);

        scanner.close();
    }
}
