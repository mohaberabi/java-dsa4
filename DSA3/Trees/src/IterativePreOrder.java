import java.util.Stack;

public class IterativePreOrder {


    void printPreOrderIterative(Node root) {

        if (root == null) {
            return;
        }

        Stack<Node> s = new Stack<>();

        s.push(root);
        while (!s.isEmpty()) {
            Node curr = s.pop();
            System.out.println(curr.data);
            if (curr.right != null) {
                s.push(curr.right);
            }
            if (curr.left != null) {
                s.push(curr.left);
            }
        }
    }
}
