import java.util.HashMap;

public class TreeFromPostInHashing {


    static class Holder {
        int index;

        public Holder(int i) {
            index = i;
        }

    }

    static Node buildUTil(int[] in,
                          int[] post,
                          int inStart,
                          int inEnd,
                          HashMap<Integer, Integer> inOrderIndex,
                          Holder holder) {


        if (inStart > inEnd) {
            return null;
        }


        int data = post[holder.index];
        Node root = new Node(data);
        holder.index--;
        if (inStart == inEnd) {
            return root;
        }
        int index = inOrderIndex.get(data);

        root.right = buildUTil(in, post, index + 1, inEnd, inOrderIndex, holder);
        root.left = buildUTil(in, post, inStart, index - 1, inOrderIndex, holder);
        return root;
    }


    static Node buildTreeFromPostInOrder(int[] in, int[] post) {
        Holder holder = new Holder(post.length - 1);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }

        Node root = buildUTil(in, post, 0, in.length - 1, map, holder);
        return root;
    }

    static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.printf("%d ", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        int in[] = {4, 8, 2, 5, 1, 6, 3, 7};
        int post[] = {8, 4, 5, 2, 6, 7, 3, 1};
        int n = in.length;
        Node root = buildTreeFromPostInOrder(in, post);
        System.out.print(
                "Preorder of the constructed tree : \n");
        preOrder(root);
    }
}
