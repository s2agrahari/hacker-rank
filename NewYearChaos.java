package rank;

/**
 * created by @author suraj on 22/10/19
 */
public class NewYearChaos {

    static void minimumBribes(int[] q) {

        int[] bribeCountArr = new int[q.length];

        int i = 0;
        int lastIndexToRestartFrom = 0;
        int lastMarkerNumber = -1;

        while (true) {

            if (i >= q.length) {

                if (lastMarkerNumber != q[lastIndexToRestartFrom]) {
                    break;
                } else {
                    i = lastIndexToRestartFrom;
                }
            }

            if (q[i] == (i + 1)) {
                ++i;
            } else {
                if (bribeCountArr[q[i] - 1] >= 2) {
                    System.out.println("Too chaotic");
                    return;
                } else {
                    if (q[i + 1] < q[i]) {
                        bribeCountArr[q[i] - 1] += 1;
                        swap(i + 1, i, q);
                    } else {
                        if (lastMarkerNumber != q[lastIndexToRestartFrom]) {
                            lastIndexToRestartFrom = i;
                            lastMarkerNumber = q[lastIndexToRestartFrom];
                        }
                        i += 1;
                    }
                }
            }
        }


        int sum = 0;

        for (int bribe : bribeCountArr) {
            sum += bribe;
        }

        System.out.println(sum);

    }

    static void swap(int i, int j, int a[]) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        minimumBribes(new int[]{1, 2, 5, 3, 4, 7, 8, 6});
    }
}
