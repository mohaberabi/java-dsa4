package Simple;

import Shared.Node;

public class BalancedBTree {


    boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }


        int left = height(root.left);
        int right = height(root.right);

        return Math.abs(left - right) <= 1 && isBalanced(root.right) && isBalanced(root.left);

    }


    int height(Node root) {
        if (root == null) {
            return 0;
        }


        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
