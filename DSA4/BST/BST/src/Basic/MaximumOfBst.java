package Basic;

import Shared.Node;

public class MaximumOfBst {
    int maximumOfBst(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }
}
