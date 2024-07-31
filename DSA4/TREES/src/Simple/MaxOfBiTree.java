package Simple;

import Shared.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaxOfBiTree {


    int maxOfBinaryTreeRecursive(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;

        }
        int left = maxOfBinaryTreeRecursive(root.left);
        int right = maxOfBinaryTreeRecursive(root.right);
        return Math.max(root.data, Math.max(left, right));
    }

    int maxOfBinaryTreeIterative(Node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int res = Integer.MIN_VALUE;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            Node poll = q.poll();
            res = Math.max(res, poll.data);
            if (poll.left != null) {
                q.add(poll.left);
            }
            if (poll.right != null) {
                q.add(poll.right);
            }
        }
        return res;
    }

}
