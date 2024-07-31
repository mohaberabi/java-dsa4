package Medium;

import Shared.Node;

public class NodesWithSameValue2 {


    static class Result {
        int count;

        public Result() {
            count = 0;
        }
    }


    int countNodesWithSameValue(Node root) {
        if (root == null) {
            return 0;
        }

        Result result = new Result();

        countRec(root, result);
        return result.count;
    }

    boolean countRec(Node root, Result result) {
        if (root == null) {
            return true;
        }


        boolean left = countRec(root.left, result);
        boolean right = countRec(root.right, result);


        if (!left || !right) {
            return false;
        }
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }


        result.count++;
        return true;
    }
}
