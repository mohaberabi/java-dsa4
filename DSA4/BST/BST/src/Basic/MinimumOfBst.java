package Basic;

import Shared.Node;

public class MinimumOfBst {


    int minimumOfBst(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        Node curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
    }
}
