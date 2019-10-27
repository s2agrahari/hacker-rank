package rank;

/**
 * created by @author suraj on 27/10/19
 */
public class Encryption {

    //rank 313542

    static String encryption(String s) {
        s = s.replaceAll("\\s+", "");

        int length = s.length();

        double sqrt = Math.sqrt(length * 1.0);

        int ceil = (int) Math.ceil(sqrt);

        int row = ceil - 1;

        if (ceil * (ceil - 1) < length) {
            row = ceil;
        }

        char arr[][] = new char[row][ceil];

        int pointer = 0;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < ceil && (j + pointer) < length; j++) {
                arr[i][j] = s.charAt(pointer + j);
            }
            pointer += ceil;
        }

        return buildString(arr, ceil, row);

    }

    public static void main(String[] args) {

        System.out.println(encryption("have a nice day"));
    }

    static String buildString(char arr[][], int ceil, int row) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ceil; i++) {
            for (int j = 0; j < row; j++) {
                if (arr[j][i] != Character.MIN_VALUE) {
                    stringBuilder.append(arr[j][i]);
                }
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().replaceAll("\\s$", "");
    }

    static void printArr(char arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
