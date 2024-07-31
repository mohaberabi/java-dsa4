package Basic;

import Shared.Node;

import java.util.Stack;

public class InOrderSuccsor {
    public Node inorderSuccessor(Node root, Node x) {


        Node curr = root;
        Stack<Node> stack = new Stack();

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (curr.data > x.data) {
                return curr;
            }
            curr = curr.right;
        }
        return null;

        //add code here.
    }
}
