package Easy;

import Shared.Node;

import java.util.Stack;

public class RootToLeafPath {


    boolean isSumExist(Node root, int sum) {
        if (root == null) {
            return false;
        }

        boolean res = false;

        int subSum = sum - root.data;

        if (subSum == 0 && root.left == null && root.right == null) {
            return res = true;
        }
        if (root.left != null) {

            res = res || isSumExist(root.left, subSum);
        }


        if (root.right != null) {
            res = res || isSumExist(root.right, subSum);
        }


        return res;
    }


    boolean isSumExistIterative(Node root, int sum) {
        if (root == null) {
            return false;
        }

        Stack<Node> stack = new Stack<>();
        Stack<Integer> sums = new Stack<>();
        stack.push(root);
        sums.add(root.data);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            int currentSum = sums.pop();
            if (curr.left == null && curr.right == null) {
                if (currentSum == sum) {
                    return true;
                }

            }
            if (curr.left != null) {
                stack.push(curr.left);
                sums.push(currentSum + curr.left.data);
            }
            if (curr.right != null) {
                stack.push(curr.right);
                sums.push(currentSum + curr.right.data);
            }
        }
        return false;
    }

}
