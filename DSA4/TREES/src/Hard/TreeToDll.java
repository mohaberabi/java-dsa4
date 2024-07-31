package Hard;

import Shared.Node;

public class TreeToDll {


    Node prev = null;

    Node treeToDll(Node root) {
        if (root == null) {
            return null;
        }

        Node head = treeToDll(root.left);


        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }

        prev = root;
        treeToDll(root.right);
        return head;

    }
}
