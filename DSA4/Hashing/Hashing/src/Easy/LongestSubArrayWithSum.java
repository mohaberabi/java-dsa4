package Easy;

import java.util.HashMap;

public class LongestSubArrayWithSum {


    static int longestSubArrayWithSum(int[] arr, int sum) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int pSum = 0;
        for (int i = 0; i < n; i++) {
            pSum += arr[i];
            if (pSum == sum) {
                res = i + 1;
            }
            if (!map.containsKey(pSum)) {
                map.put(pSum, i);
            }
            if (map.containsKey(pSum - sum)) {
                res = Math.max(res, i - map.get(pSum - sum));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int res = longestSubArrayWithSum(arr, 15);
        System.out.println(res);
    }
}
