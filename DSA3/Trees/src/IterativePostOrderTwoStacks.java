import java.util.Stack;

public class IterativePostOrderTwoStacks {


    void printPostOrderTwoStacks(Node root) {


        if (root == null) {
            return;
        }

        Stack<Node> first = new Stack<>();
        Stack<Node> second = new Stack<>();

        first.push(root);
        while (!first.isEmpty()) {
            Node pop = first.pop();
            second.push(pop);

            if (pop.left != null) {
                first.push(pop.left);
            }
            if (pop.right != null) {
                first.push(pop.right);
            }
        }

        while (!second.isEmpty()) {
            Node pop = second.pop();
            System.out.print(pop.data + " ");
        }
    }
}
