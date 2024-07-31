package Medium;

import java.util.ArrayList;
import java.util.HashSet;

public class PresentInOneNoOther {


    ArrayList<Integer> noInOther(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();
        for (int x : b) {
            set.add(x);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int x : a) {

            if (!set.contains(x)) {
                res.add(x);
            }
        }
        return res;
    }
}
