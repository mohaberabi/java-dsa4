package Basic;

import Shared.Node;

public class Ceil {


    Node ceil(Node root, int x) {
        if (root == null) {
            return null;
        }

        Node curr = root;
        Node ceil = null;
        while (curr != null) {
            if (curr.data == x) {
                return curr;
            } else if (curr.data > x) {
                ceil = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return ceil;
    }
}
