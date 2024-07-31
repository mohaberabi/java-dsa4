package Easy;

import java.util.HashSet;

public class SubArrayWihZeroSum {


    boolean subArrayWithZeroSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int pSum = 0;
        for (int x : arr) {
            pSum += x;

            if (pSum == 0) {
                return true;
            }

            if (set.contains(pSum)) {
                return true;
            }
            set.add(pSum);
        }
        return false;
    }


}
