package Basic;

import Shared.Node;

public class Floor {


    Node floor(Node root, int x) {
        if (root == null) {
            return null;
        }


        Node curr = root;
        Node floor = null;
        while (curr != null) {
            if (curr.data == x) {
                return curr;
            } else if (curr.data > x) {
                curr = curr.left;
            } else {
                floor = curr;
                curr = curr.right;
            }
        }
        return floor;
    }
}
