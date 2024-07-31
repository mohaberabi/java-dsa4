import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IsSumTree {


    boolean isSumTree(Node root) {
        if (root == null) {
            return true;
        }

        if (root.right == null && root.left == null) {
            return true;
        }


        if (root.left == null) {
            return root.right.data == root.data;
        }

        if (root.right == null) {
            return root.left.data == root.data;
        }


        boolean left = isSumTree(root.left);
        boolean right = isSumTree(root.right);
        int sum = root.left.data + root.right.data;
        boolean forRoot = sum == root.data;
        return left && right && forRoot;
    }


    boolean isSumTreeIterative(Node root) {

        if (root == null) {
            return true;
        }


        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {

            Node curr = q.poll();


            int rootData = curr.data;

            int left = curr.left == null ? 0 : curr.left.data;
            int right = curr.right == null ? 0 : curr.right.data;

            boolean satisfy = rootData == left + right;

            if (curr.left == null && curr.right == null || (satisfy)) {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            } else {
                return false;
            }

        }

        return true;
    }


}
