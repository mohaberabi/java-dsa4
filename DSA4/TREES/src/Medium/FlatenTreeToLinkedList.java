package Medium;

import Shared.Node;

import java.util.Stack;

public class FlatenTreeToLinkedList {


    void flattenToLinkedList(Node root) {
        Node dummy = new Node(-1);
        Node dummyTail = dummy;


        Stack<Node> stack = new Stack<>();


        stack.push(root);
        while (!stack.isEmpty()) {

            Node curr = stack.pop();


            Node left = curr.left;
            Node right = curr.right;

            curr.left = null;
            curr.right = null;

            dummyTail.right = curr;
            dummyTail = dummyTail.right;
            if (right != null) {
                stack.push(right);
            }
            if (left != null) {
                stack.push(left);
            }
        }

        root = dummy.right;
    }
}
