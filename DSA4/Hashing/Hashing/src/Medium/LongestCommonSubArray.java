package Medium;

import java.util.HashMap;

public class LongestCommonSubArray {


    int longestCommonSubArray(int[] a, int[] b) {

        int[] difference = new int[a.length];

        int n = a.length;
        for (int i = 0; i < n; i++) {
            difference[i] = a[i] - b[i];
        }
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += difference[i];
            if (sum == 0) {
                res = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum)) {
                res = Math.max(res, i - map.get(sum));
            }
        }
        return res;
    }


}
