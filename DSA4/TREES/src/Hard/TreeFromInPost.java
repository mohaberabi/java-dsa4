package Hard;

import Shared.Node;

public class TreeFromInPost {


    static Node buildTreeFromPostAndInOrder(int[] post, int[] in) {

        Node root = buildUtil(post, in, 0, post.length - 1, 0, post.length - 1);
        return root;
    }

    static Node buildUtil(int[] post, int[] in, int inStart, int inEnd, int postStart, int postEnd) {


        if (inStart > inEnd) {
            return null;
        }


        Node root = new Node(post[postEnd]);

        if (inStart == inEnd) {
            return root;
        }

        int inIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        root.left = buildUtil(post,
                in,
                inStart,
                inIndex - 1, postStart,
                postStart - inStart + inIndex - 1
        );
        root.right = buildUtil(post,
                in,
                inIndex + 1, inEnd,
                postEnd - inEnd + inIndex,
                postEnd - 1);

        return root;

    }
}
