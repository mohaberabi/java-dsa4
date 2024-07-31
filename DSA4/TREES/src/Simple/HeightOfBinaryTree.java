package Simple;

import Shared.Node;

public class HeightOfBinaryTree {


    int heightOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }


        int left = heightOfBinaryTree(root.left);
        int right = heightOfBinaryTree(root.right);
        return Math.max(right, left) + 1;
    }
}
