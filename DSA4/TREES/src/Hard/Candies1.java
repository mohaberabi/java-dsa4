package Hard;

import Shared.Node;

public class Candies1 {


    static class Result {
        int res;

        public Result() {
            res = 0;
        }
    }


    int movesToMakeAllEqual1(Node root) {
        if (root == null) {
            return 0;
        }

        Result res = new Result();
        int count = count(root, res);
        return res.res;
    }


    int count(Node root, Result res) {
        if (root == null) {
            return 0;
        }

        int left = count(root.left, res);
        int right = count(root.right, res);
        res.res += Math.abs(left) + Math.abs(right);
        return root.data + left + right - 1;
    }
}
