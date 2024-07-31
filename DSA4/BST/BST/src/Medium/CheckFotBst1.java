package Medium;

import Shared.Node;

import java.util.Stack;

public class CheckFotBst1 {


    Node prev = null;


    boolean checkForBst(Node root) {
        if (root == null) {
            return true;
        }


        if (!checkForBst(root.left)) {
            return false;
        }
        if (prev != null && prev.data >= root.data) {
            return false;
        }
        prev = root;
        return checkForBst(root.right);

    }


}
