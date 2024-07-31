package Medium;

import Shared.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {


    int maxWidthOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }

        int res = 0;


        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            res = Math.max(res, n);

            for (int i = 0; i < n; i++) {
                Node poll = q.poll();

                if (poll.left != null) {
                    q.add(poll.left);
                }
                if (poll.right != null) {
                    q.add(poll.right);
                }
            }
        }

        return res;
    }
}
