package Medium;

import Shared.Node;

import java.util.ArrayList;

public class MaximumPathSum {

    class Result {
        int maxSum;

        public Result() {
            this.maxSum = Integer.MIN_VALUE;
        }
    }

    int findMaxSum(Node root) {
        Result result = new Result();
        maxPathSumHelper(root, result);
        return result.maxSum;
        //your code goes here
    }


    int maxPathSumHelper(Node node, Result result) {
        if (node == null) {
            return 0;
        }

        int leftSum = Math.max(maxPathSumHelper(node.left, result), 0);
        int rightSum = Math.max(maxPathSumHelper(node.right, result), 0);

        int currentMaxSum = leftSum + rightSum + node.data;
        result.maxSum = Math.max(result.maxSum, currentMaxSum);

        return Math.max(leftSum, rightSum) + node.data;
    }
}
