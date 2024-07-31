public class SymmetricTree {


    boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    boolean isMirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return (left.data == right.data) &&
                isMirror(left.left, right.right) &&
                isMirror(left.right, right.left);
    }

}
