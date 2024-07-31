package Medium;

import java.util.HashSet;

public class PairWithSumUnSortedArray {


    boolean pairWithSumUnSortedArray(int[] arr, int sum) {


        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(sum - x)) {
                return true;
            } else {
                set.add(x);
            }
        }
        return false;
    }
}
