package Medium;

import Shared.Node;

public class CheckForBst3 {


    boolean isBst(Node root) {

        return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBstUtil(Node root, int min, int max) {


        if (root == null) {
            return true;
        }

        boolean forRoot = root.data > min && root.data < max;

        return forRoot && isBstUtil(root.left, min, root.data) &&
                isBstUtil(root.right, root.data, max);
    }
}
