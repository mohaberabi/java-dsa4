package Hard;

import Shared.Node;

public class TreeFromPreInOrder {


    int preIndex = 0;

    Node buildTreeFromPreInOrder(int[] in, int[] pre, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }


        Node root = new Node(pre[preIndex]);
        preIndex++;


        int inIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        root.left = buildTreeFromPreInOrder(in, pre, inStart, inIndex - 1);
        root.right = buildTreeFromPreInOrder(in, pre, inIndex + 1, inEnd);
        return root;
    }
}
