package Basic;

import Shared.Node;

public class Search {


    static boolean searchIterative(Node root, int x) {
        if (root == null) {
            return false;
        }


        Node curr = root;

        while (curr != null) {
            if (curr.data == x) {
                return true;
            } else if (curr.data > x) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return false;
    }

    static boolean search(Node root, int x) {
        if (root == null) {
            return false;
        }

        if (x == root.data) {
            return true;
        } else if (root.data > x) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
        }
    }
}
