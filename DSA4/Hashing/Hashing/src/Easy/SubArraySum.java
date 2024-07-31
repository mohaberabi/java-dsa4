package Easy;

import java.util.HashSet;

public class SubArraySum {


    boolean subarrayWithSum(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int pSum = 0;
        for (int x : arr) {
            pSum += x;

            if (pSum == sum) {
                return true;
            }

            if (set.contains(pSum - sum)) {
                return true;
            }
            set.add(pSum);
        }
        return false;
    }
}
