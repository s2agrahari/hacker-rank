package rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * created by @author suraj on 20/10/19
 */
public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {

        if (k == contests.length || k>=countImportantContests(contests)) {
            return countTotalLuckBalance(contests);
        }

        if (k == 0) {
            return countTotalLuckBalanceForUnImportantOne(contests);
        }

        int nonImportantLucks = countTotalLuckBalanceForUnImportantOnes(contests);

        //sort lucks by important in ascending order

        List<Integer> luckList = new ArrayList<>();

        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 1) {
                luckList.add(contests[i][0]);
            }
        }


        Collections.sort(luckList);

        int toWin = luckList.size() - k;

        int importantLucks = 0;

        for (int i = toWin; i > 0 && i < luckList.size(); i++) {
            importantLucks += luckList.get(i);
        }

        for (int i = 0; i < toWin; i++) {
            importantLucks -= luckList.get(i);
        }

        return nonImportantLucks + importantLucks;
    }

    static int countTotalLuckBalanceForUnImportantOnes(int[][] contests) {
        int luckBalance = 0;
        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 0) {
                luckBalance += contests[i][0];
            }
        }
        return luckBalance;
    }

    static int countTotalLuckBalanceForUnImportantOne(int[][] contests) {
        int luckBalance = 0;
        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 0) {
                luckBalance += contests[i][0];
            } else {
                luckBalance -= contests[i][0];
            }
        }
        return luckBalance;
    }


    static int countImportantContests(int[][] contests) {
        int count = 0;
        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 1) {
                ++count;
            }
        }
        return count;
    }

    static int countTotalLuckBalance(int[][] contests) {
        int luckBalance = 0;
        for (int i = 0; i < contests.length; i++) {
            luckBalance += contests[i][0];
        }
        return luckBalance;
    }


    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {105, 0},
                {103, 0},
                {106, 1},
                {106, 1},
                {103, 0},
                {103, 1},
                {105, 1},
                {106, 1},
                {105, 0},
                {104, 0},
                {103, 0},
                {102, 0},
                {104, 0},
                {105, 0},
                {104, 0},
                {102, 1},
                {104, 0},
                {106, 1},
                {104, 1},
                {101, 1},
                {105, 0},
                {103, 0},
                {104, 0},
                {106, 0},
                {102, 1},
                {103, 0},
                {102, 0},
                {103, 1},
                {106, 0},
                {104, 1},
                {101, 1},
                {101, 1},
                {106, 0},
                {103, 1},
                {103, 0},
                {104, 1},
                {101, 0},
                {105, 1},
                {105, 0},
                {104, 1},
                {105, 0},
                {106, 0},
                {104, 0},
                {105, 0},
                {101, 1},
                {106, 1},
                {105, 0},
                {103, 0},
                {104, 1},
                {101, 1},
                {106, 1},
                {104, 0},
                {106, 1},
                {105, 0},
                {103, 1},
                {101, 0},
                {103, 0},
                {101, 0},
                {105, 1},
                {104, 1},
                {104, 1},
                {105, 1},
                {105, 1},
                {103, 0},
                {101, 0},
                {104, 1},
                {106, 1},
                {105, 1},
                {105, 0},
                {106, 1},
                {104, 1},
                {105, 1},
                {103, 1},
                {102, 1},
                {106, 0},
                {101, 0},
                {105, 1},
                {104, 1},
                {103, 1},
                {106, 1},
                {101, 0},
                {106, 1},
                {103, 0},
                {106, 1},
                {102, 1},
                {103, 0},
                {101, 1},
                {102, 1},
                {101, 1},
                {104, 0},
                {106, 0},
                {102, 0},
                {104, 0},
                {105, 0},
                {105, 0},
                {102, 1},
                {103, 1}
        };

        System.out.println(luckBalance(58, arr));
    }
}
