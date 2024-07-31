package Traversals;

import Shared.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {


    void binaryTreeLevelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {

            Node poll = q.poll();
            System.out.println(poll.data);
            if (poll.left != null) {
                q.add(poll.left);
            }
            if (poll.right != null) {
                q.add(root.right);
            }
        }
    }
}
