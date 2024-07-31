package Medium;

import Shared.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NodesWithSameValue {


    int nodesWithSameValue(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();


        q.add(root);

        int res = 0;
        while (!q.isEmpty()) {

            Node poll = q.poll();

            if (satsify(poll)) {
                res++;
            }
            if (poll.left != null) {
                q.add(poll.left);
            }
            if (poll.right != null) {
                q.add(poll.right);
            }

        }


        return res;
    }


    boolean satsify(Node root) {
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }
        return true;
    }
}
