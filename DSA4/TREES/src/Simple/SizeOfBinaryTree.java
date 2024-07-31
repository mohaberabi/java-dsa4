package Simple;

import Shared.Node;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {


    int sizeOFBianryTree(Node root) {
        if (root == null) {
            return 0;
        }

        int left = sizeOFBianryTree(root.left);
        int right = sizeOFBianryTree(root.left);
        return 1 + (left + right);
    }


    int sizeOFTreeIterative(Node root) {

        if (root == null) {
            return 0;
        }

        int res = 0;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            Node poll = q.poll();
            res++;
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
