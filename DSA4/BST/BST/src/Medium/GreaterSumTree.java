package Medium;

import Shared.Node;

public class GreaterSumTree {


    static class Result {
        int res;

        public Result() {
            res = 0;
        }
    }


    void reverseInOrder(Node root, Result result) {


        if (root == null) {
            return;
        }

        reverseInOrder(root.right, result);
        int temp = root.data;

        root.data = result.res;
        result.res += temp;
        reverseInOrder(root.left, result);
    }
}
