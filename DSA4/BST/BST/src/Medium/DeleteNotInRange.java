package Medium;

import Shared.Node;

public class DeleteNotInRange {


    Node succ(Node root) {
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
        } else if (root.data > x) {
            root.left = delete(root.left, x);
        } else {
            Node suc = succ(root);

            root.data = suc.data;

            root.right = delete(root, suc.data);
        }

        return root;
    }


    Node deleteNotInRange(Node root, int min, int max) {
        if (root == null) {
            return null;
        }

        root.left = deleteNotInRange(root.left, min, max);
        root.right = deleteNotInRange(root.right, min, max);

        if (root.data < min) {

            Node right = root.right;
            root = null;
            return right;
        }
        if (root.data > max) {
            Node left = root.left;
            root = null;
            return left;
        }


        return root;
    }
}
