package Hard;

import Shared.Node;

public class BurnTreeFromLeaf {


    int res = 0;


    static class Distance {
        int val;

        public Distance(int v) {
            val = v;
        }
    }


    int burnTime(Node root, int leaf, Distance distance) {
        if (root == null) {
            return 0;
        }
        if (root.data == leaf) {
            distance.val = 0;
            return 1;
        }


        Distance leftDistance = new Distance(-1);
        Distance rightDistance = new Distance(-1);
        int leftHeight = burnTime(root.left, leaf, leftDistance);
        int rightHeight = burnTime(root.right, leaf, rightDistance);


        if (leftDistance.val != -1) {
            distance.val = rightDistance.val + 1;
            res = Math.max(res, distance.val + rightHeight);
        } else if (rightDistance.val != -1) {
            distance.val = rightDistance.val + 1;
            res = Math.max(res, distance.val + leftHeight);
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
