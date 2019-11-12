package rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * created by @author suraj on 12/11/19
 */
public class BreakingTheRecords {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        System.out.println(result);

        bufferedReader.close();
    }

    static int birthday(List<Integer> s, int d, int m) {

        int count = 0;

        int size = s.size();

        int i = 0;

        int sum = 0;

        for (; i < m; i++) {
            sum += s.get(i);
        }

        if (sum == d) {
            count += 1;
        }

        if (m == size) {
            return count;
        }


        for (; i < size; i++) {
            int localSum = sum - (s.get(i - m)) + s.get(i);
            if (localSum == d) {
                count += 1;
            }
            sum = localSum;
        }

        return count;

    }
}
