package Medium;

import Shared.Node;

import java.util.Stack;

public class KthLargestElementInBst {
    public int kthLargest(Node root, int k) {
        Stack<Node> s = new Stack();
        int i = 0;
        Node curr = root;
        while (curr != null || s.isEmpty() == false) {
            while (curr != null) {
                s.push(curr);
                curr = curr.right;
            }

            curr = s.pop();
            i++;
            if (i == k) {
                return curr.data;
            }
            curr = curr.left;
        }
        return -1;
        //Your code here
    }
}
