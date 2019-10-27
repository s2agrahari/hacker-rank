package rank;

/**
 * created by @author suraj on 23/10/19
 */
public class MinSwap {

    static int minimumSwaps(int[] arr) {
        return minSwap(arr, 0, -1);
    }

    static int minSwap(int[] arr, int sum, int largestIndexAt) {

        int largestNumber = -1;

        while (true) {

            if (largestIndexAt == arr.length) {
                break;
            }

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] != (i + 1)) {
                    if (arr[i] > largestNumber) {
                        largestNumber = arr[i];
                        largestIndexAt = i;
                    }
                }
            }

            int maxDiff = -1;
            int maxDiffIndex = -1;

            for (int i = largestIndexAt + 1; i < arr.length; i++) {
                int diff = arr[largestIndexAt] - arr[i];
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxDiffIndex = i;
                }
            }

            if (maxDiff > 0) {
                swap(largestIndexAt, maxDiffIndex, arr);
                sum += 1;
            }

            largestIndexAt += 1;
        }

        return sum > 0 ? sum + 1 : sum;
    }

    static void swap(int i, int j, int a[]) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));

    }
}
