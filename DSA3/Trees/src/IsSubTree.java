public class IsSubTree {


    boolean isSubTree(Node s, Node t) {
        if (s == null) {
            return false;
        }
        if (t == null) {
            return false;
        }
        if (t == s) {
            return true;
        }
        return isSame(s.left, t) || isSame(s.right, t);
    }

    boolean isSame(Node s, Node t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }

        return t.data == s.data
                && isSame(s.right, t.right) &&
                isSame(s.left, t.left);
    }
}
