package Hard;

import Shared.Node;

public class FixBstWithTwoSwappedNodes {


    Node prev = null;
    Node first = null;
    Node second = null;


    void fixBST(Node root) {
        if (root == null) {
            return;
        }


        findTwoNodes(root);


        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }

    void findTwoNodes(Node root) {

        if (root == null) {
            return;
        }

        findTwoNodes(root.left);
        if (prev != null && prev.data >= root.data) {
            if (first == null) {
                first = prev;
            }
            second = prev;

        }
        prev = root;
        findTwoNodes(root.right);
    }
}
