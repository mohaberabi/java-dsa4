package Simple;

import Shared.Node;

public class BalancedTreeOptimized {


    boolean isBalanced(Node root) {
        if (getHeightWithBalanced(root) == -1) {
            return false;
        }
        return true;
    }

    int getHeightWithBalanced(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeightWithBalanced(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightheight = getHeightWithBalanced(root.right);
        if (rightheight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightheight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightheight) + 1;
        }
    }
}
