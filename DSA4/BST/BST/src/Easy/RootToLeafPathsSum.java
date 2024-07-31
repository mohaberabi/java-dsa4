package Easy;

import Shared.Node;

import java.util.Stack;

public class RootToLeafPathsSum {

    //Function to find the sum of all root to leaf paths.
    public static long treePathsSum(Node root) {
        //Calling the helper function inorder to calculate the sum
        //of all root to leaf paths.
        return preorder(root, 0);
    }

    //Helper function to calculate the sum of all root to leaf paths.
    public static long preorder(Node root, long val) {
        //If the current node is null, return 0.
        if (root == null)
            return 0;

        //Calculate the new value as the sum so far multiplied by 10
        //and the current node's data.
        val = val * 10 + root.data;

        //If the current node is a leaf node, return the accumulated value.
        if (root.left == null && root.right == null)
            return val;

        //Recursively calculate the sum of root to leaf paths in the left and right subtree.
        return preorder(root.left, val) + preorder(root.right, val);
    }

    long treePathsSumiterative(Node root) {
        if (root == null) {
            return 0;
        }
        Stack<Node> stack = new Stack<>();
        Stack<String> sums = new Stack<>();

        stack.push(root);
        long res = 0;

        sums.push(Long.toString(root.data));
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            String currentSum = sums.pop();
            if (curr.left == null && curr.right == null) {

                res += Long.parseLong(currentSum);
            }
            if (curr.right != null) {
                stack.push(curr.right);

                sums.push(currentSum + (long) curr.right.data);
            }
            if (curr.left != null) {
                stack.push(curr.left);
                sums.push(currentSum + (long) curr.left.data);
            }

        }

        return res;
    }
}
