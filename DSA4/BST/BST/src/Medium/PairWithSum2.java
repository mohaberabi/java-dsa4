package Medium;

import Shared.Node;

import java.util.HashMap;
import java.util.HashSet;

public class PairWithSum2 {


    boolean pairWithSumExist(Node root, HashSet<Integer> set, int sum) {


        if (root == null) {
            return false;
        }


        if (pairWithSumExist(root.left, set, sum)) {
            return true;
        }

        if (set.contains(sum - root.data)) {
            return true;
        } else {
            set.add(root.data);

        }

        return pairWithSumExist(root.right, set, sum);
    }
}
