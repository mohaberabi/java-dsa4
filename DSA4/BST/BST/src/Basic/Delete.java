package Basic;

import Shared.Node;

public class Delete {


    Node succssor(Node root) {
        Node curr = root.right;

        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    Node delete(Node root, int x) {
        if (root == null) {
            return null;
        }

        if (x > root.data) {
            root.right = delete(root.right, x);
        } else if (x < root.data) {
            root.left = delete(root.left, x);
        } else {
            Node succ = succssor(root);
            root.data = succ.data;

            root.right = delete(root.right, succ.data);
        }
        return root;

    }
}
