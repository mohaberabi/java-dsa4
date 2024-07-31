package Traversals;

import Shared.Node;

import java.util.Stack;

public class IterativeInOrder {


    void iterativeInOrder(Node root) {

        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.println(curr.data);
            curr = curr.right;

        }
    }
}
