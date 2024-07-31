package Medium;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNByK {


    void printMoreThanNByK(int[] arr, int k) {


        int n = arr.length;
        int res = n / k;


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > res) {
                System.out.println(e.getKey());
            }
        }
    }

    void printMoreThanNByKBetter(int[] arr, int k) {
        int n = arr.length;
        int res = n / k;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else if (map.size() < k - 1) {
                map.put(x, 1);
            } else {
                for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    map.put(e.getKey(), e.getValue() - 1);
                    if (map.get(e.getKey()) == 0) {
                        map.remove(e.getKey());
                    }
                }
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int count = 0;
            for (int x : arr) {
                if (e.getKey() == x) {
                    count++;
                }
            }
            if (count > res) {
                System.out.println(e.getKey());
            }
        }
    }
}
