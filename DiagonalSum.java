package rank;

import java.util.ArrayList;
import java.util.List;

/**
 * created by @author suraj on 22/10/19
 */
public class DiagonalSum {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int size = arr.size();

        int leftDiagonalSum = 0;

        int rightDiagonalSum = 0;

        for (int i = 0; i < size; i++) {

            leftDiagonalSum += arr.get(i).get(i);
            rightDiagonalSum += arr.get(i).get(size - i - 1);
        }


        return Math.abs(leftDiagonalSum - rightDiagonalSum);

    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();

        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();

        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();

        row3.add(10);
        row3.add(8);
        row3.add(-12);

        list.add(row1);
        list.add(row2);
        list.add(row3);


        System.out.println(diagonalDifference(list));
    }



}
