package Basic;

import Shared.Node;

public class Insert {


    Node insert(Node root, int x) {
        Node added = new Node(x);
        if (root == null) {
            return added;
        }
        if (root.data < x) {
            root.right = insert(root.right, x);
        } else if (root.data > x) {
            root.left = insert(root.left, x);
        }
        return root;
    }


    Node insertIterative(Node root, int x) {
        Node added = new Node(x);
        if (root == null) {
            return added;
        }
        Node curr = root;
        Node parent = null;
        while (curr != null) {
            parent = curr;
            if (curr.data > x) {
                curr = curr.left;
            } else if (curr.data < x) {
                curr = curr.right;
            } else {
                return root;
            }
        }

        if (parent.data > x) {
            parent.left = added;
        } else {
            parent.right = added;
        }

        return root;
    }
}
