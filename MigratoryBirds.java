package rank;

import java.util.ArrayList;
import java.util.List;

/**
 * created by @author suraj on 15/11/19
 */
public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {

        int ar[] = new int[5];

        for (Integer bird : arr) {
            ar[--bird]++;
        }

        int id = Integer.MAX_VALUE;

        int maxCount = -1;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == maxCount && i < id) {
                id = i;
            } else if (ar[i] > maxCount) {
                id = i;
                maxCount = ar[i];
            }
        }
        return id + 1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1 4 4 4 5 3
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(3);

        System.out.println(migratoryBirds(list));
    }

}
