package Medium;

import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays {


    int intersectionOFTwoUnSortedArrays(int[] a, int[] b) {


        HashSet<Integer> set = new HashSet<>();

        int res = 0;
        for (int x : a) {
            set.add(x);
        }


        for (int x : b) {
            if (set.contains(x)) {
                res++;
                set.remove(x);
            }
        }
        return res;
    }
}
