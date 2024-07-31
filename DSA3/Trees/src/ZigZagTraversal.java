import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversal {


    void printZigZag(Node root) {

        Queue<Node> q = new LinkedList<>();

        Stack<Node> stack = new Stack<>();
        if (root == null) {
            return;
        }
        q.add(root);

        boolean reverse = false;
        while (!q.isEmpty()) {

            int n = q.size();
            for (int i = 0; i < n; i++) {

                Node curr = q.poll();
                if (reverse) {
                    stack.push(curr);
                } else {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            if (reverse) {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop().data + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }

    }

    void printZigZagTraversalBetter(Node root) {

        if (root == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            while (!s1.isEmpty()) {
                Node pop = s1.pop();
                System.out.println(pop.data);
                if (pop.left != null) {
                    s2.push(pop.left);
                }
                if (pop.right != null) {
                    s2.push(pop.right);
                }
            }
            while (!s2.isEmpty()) {
                Node pop = s2.pop();
                System.out.println(pop.data);
                if (pop.right != null) {
                    s1.push(pop.right);
                }
                if (pop.left != null) {
                    s1.push(pop.left);
                }
            }
        }
    }
}
