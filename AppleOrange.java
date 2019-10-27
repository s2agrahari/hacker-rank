package rank;

/**
 * created by @author suraj on 27/10/19
 */
public class AppleOrange {


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int applesCount = 0;
        int orangeCount = 0;

        for (int apple : apples) {

            if (apple >= 0) {
                int dist = a + apple;
                if (dist >= s && dist <= t) {
                    applesCount += 1;
                }
            }
        }

        for (int orange : oranges) {

            if (orange <= 0) {
                int dist = b + orange;
                if (dist>=s && dist<=t){
                    orangeCount+=1;
                }
            }
        }

        System.out.println(applesCount);
        System.out.println(orangeCount);

    }
}
