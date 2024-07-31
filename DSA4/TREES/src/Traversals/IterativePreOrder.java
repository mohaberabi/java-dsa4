package Traversals;

import Shared.Node;

import java.util.Stack;

public class IterativePreOrder {


    void preOrderTraversalSpaceOptimizedIterative(Node root) {


        if (root == null) {
            return;
        }

        Node curr = root;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                System.out.println(curr.data);
                if (curr.right != null) {
                    s.push(curr.right);
                }
                curr = curr.left;
            }
            if (!s.isEmpty()) {
                curr = s.pop();
            }

        }
    }

    void printPreOrderIterative(Node root) {

        if (root == null) {
            return;
        }

        Stack<Node> s = new Stack<>();

        s.push(root);
        while (!s.isEmpty()) {
            Node curr = s.pop();
            System.out.println(curr.data);
            if (curr.right != null) {
                s.push(curr.right);
            }
            if (curr.left != null) {
                s.push(curr.left);
            }
        }
    }
}
