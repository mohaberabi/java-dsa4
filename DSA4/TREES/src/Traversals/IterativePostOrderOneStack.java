package Traversals;

import Shared.Node;

import java.util.Stack;

public class IterativePostOrderOneStack {


    void iterativePostOrderOneStack(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();


        Node curr = root;

        while (true) {
            while (curr != null) {
                stack.push(curr);
                stack.push(curr);
                curr = curr.left;
            }
            if (stack.isEmpty()) {
                return;
            }
            curr = stack.pop();
            if (!stack.isEmpty() && stack.peek() == curr) {
                curr = curr.right;

            } else {
                System.out.print(curr.data + " ");
                curr = null;
            }
        }

    }
}
