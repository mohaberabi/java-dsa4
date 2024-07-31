package Medium;

import Shared.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    static class Holder {
        int maxLevel;

        public Holder() {
            maxLevel = 0;
        }
    }


    void printLeftView(Node root) {
        Holder holder = new Holder();
        leftViewRecrusrive(root, 1, holder);
    }

    void leftViewRecrusrive(Node root, int level, Holder holder) {

        if (root == null) {
            return;
        }
        if (holder.maxLevel < level) {
            System.out.println(root.data);
            holder.maxLevel = level;
        }
        leftViewRecrusrive(root.left, level + 1, holder);
        leftViewRecrusrive(root.right, level + 1, holder);

    }

    void printLeftViewOFBinaryTree(Node root) {
        if (root == null) {

            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                Node cur = q.poll();
                if (i == 0) {
                    System.out.println(cur.data);
                }

                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
    }
}
