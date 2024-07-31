package Medium;

import java.util.HashMap;

public class PrintDistnictAtKWindow {


    void printDitnictAtKWindow(int[] arr, int k) {

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map.size());
        for (int i = k; i < n; i++) {
            if (map.containsKey(arr[i - k])) {
                int val = map.get(arr[i - k]);
                if (val - 1 == 0) {
                    map.remove(arr[i - k]);
                } else {
                    map.put(arr[i - k], map.get(arr[i - k]) - 1);
                }
            }

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i] + 1));
            } else {
                map.put(arr[i], 1);
            }

            System.out.println(map.size());
        }
    }
}
