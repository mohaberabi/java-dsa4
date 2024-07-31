package Medium;

import Shared.Node;

import java.util.Stack;

public class CheckFotBst2 {
    boolean isBstIterative(Node root) {


        if (root == null) {
            return true;
        }


        Stack<Node> stack = new Stack<>();

        Node curr = root;
        Node prev = null;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }


            curr = stack.pop();

            if (prev != null && prev.data >= curr.data) {
                return false;
            }

            prev = curr;
            curr = curr.right;
        }

        return true;
    }

}
