package rank;

import java.util.List;
import java.util.stream.Collectors;

/**
 * created by @author suraj on 22/10/19
 */
public class ValleyCounting {


    static int countingValleys(int n, String s) {

        int seaLevel = 0;

        int valleyCount = 0;

        for (String chr : s.split("")) {

            if ("U".equals(chr)) {
                seaLevel += 1;
                if (seaLevel == 0) {
                    valleyCount += 1;
                }
            } else {
                seaLevel -= 1;
            }
        }

        return valleyCount;

    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        return grades.stream()
                .map(grade -> {

                    if (grade < 38 || grade % 5 == 0) {
                        return grade;
                    }

                    int finalToBeGrade = grade + (5 - grade % 5);

                    if (finalToBeGrade - grade < 3) {
                        return finalToBeGrade;
                    } else {
                        return grade;
                    }
                }).collect(Collectors.toList());

    }

}
