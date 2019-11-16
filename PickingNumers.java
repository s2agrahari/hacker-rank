package rank;

import java.util.*;

/**
 * created by @author suraj on 16/11/19
 */
public class PickingNumers {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        return pickingNumber(a);
    }

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        //4 6 5 3 3 1
        integers.add(4);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(97);
        integers.add(4);
        integers.add(97);
        integers.add(4);
        integers.add(97);
        integers.add(97);
        integers.add(97);
        integers.add(97);
        integers.add(4);
        integers.add(4);
        integers.add(5);
        integers.add(5);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(99);
        integers.add(4);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(97);
        integers.add(97);
        integers.add(5);
        integers.add(5);
        integers.add(97);
        integers.add(4);
        integers.add(5);
        integers.add(97);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(4);
        integers.add(97);
        integers.add(5);
        integers.add(4);
        integers.add(4);
        integers.add(97);
        integers.add(5);
        integers.add(5);
        integers.add(5);
        integers.add(4);
        integers.add(97);
        integers.add(97);
        integers.add(4);
        integers.add(97);
        integers.add(5);
        integers.add(4);
        integers.add(4);
        integers.add(97);
        integers.add(97);
        integers.add(97);
        integers.add(5);
        integers.add(5);
        integers.add(97);
        integers.add(4);
        integers.add(97);
        integers.add(97);
        integers.add(5);
        integers.add(4);
        integers.add(97);
        integers.add(97);
        integers.add(4);
        integers.add(97);
        integers.add(97);
        integers.add(97);
        integers.add(5);
        integers.add(4);
        integers.add(4);
        integers.add(97);
        integers.add(4);
        integers.add(4);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(97);
        integers.add(97);
        integers.add(97);
        integers.add(4);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(5);
        integers.add(4);
        integers.add(97);
        integers.add(4);
        integers.add(5);
        integers.add(97);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(5);
        integers.add(97);
        integers.add(97);
        integers.add(97);

        System.out.println(pickingNumber(integers));
    }

    private static int pickingNumber(List<Integer> a) {

        Map<Integer, Integer> mapCount = new HashMap<>();

        for (Integer i : a) {
            Integer count = mapCount.get(i);
            if (count == null) {
                mapCount.put(i, 1);
            } else {
                mapCount.put(i, ++count);
            }
        }

        List<Integer> keyList = new ArrayList<>(mapCount.keySet());

        Collections.sort(keyList);

        int keyChecked = keyList.get(0);

        int maxCount = mapCount.get(keyChecked);

        for (int i = 1; i < keyList.size(); i++) {

            if (keyList.get(i) - keyChecked == 1) {
                maxCount = Math.max(maxCount, mapCount.get(keyChecked) + mapCount.get(keyList.get(i)));
            } else {
                maxCount = Math.max(mapCount.get(keyList.get(i)), maxCount);
            }

            keyChecked = keyList.get(i);
        }

        return maxCount;
    }
}
