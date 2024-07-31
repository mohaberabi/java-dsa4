package Medium;

import Shared.Node;

import java.util.LinkedList;
import java.util.Queue;

public class ParentSumTree {


    boolean isParentSumTree(Node root) {
        if (root == null) {
            return false;
        }


        return isSumTree(root) != -1;
    }


    int isSumTree(Node root) {
        if (root == null) {
            return 0;
        }

        int left;
        int right;


        left = isSumTree(root.left);

        if (left == -1) {
            return -1;
        }

        right = isSumTree(root.right);
        if (right == -1) {
            return -1;
        }

        if (isLeaf(root) || right + left == root.data) {
            return right + left + root.data;
        } else {
            return -1;
        }
    }

    boolean isLeaf(Node root) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
}
