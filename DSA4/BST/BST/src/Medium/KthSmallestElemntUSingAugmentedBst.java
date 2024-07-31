package Medium;

import Shared.Node;

public class KthSmallestElemntUSingAugmentedBst {


    Node insertWIthAugmentation(Node root, int x) {
        Node added = new Node(x);

        if (root == null) {
            return added;
        }


        if (root.data < x) {
            root.right = insertWIthAugmentation(root.right, x);
        } else if (root.data > x) {

            root.left = insertWIthAugmentation(root.left, x);
            root.leftCount++;
        }
        return root;
    }


    Node kthSmallestElement(Node root, int k) {
        if (root == null) {
            return null;
        }

        Node curr = root;

        while (curr != null) {
            if (k == curr.leftCount + 1) {
                return curr;
            } else if (k > curr.leftCount + 1) {
                curr = curr.left;
            } else {
                k = k - curr.leftCount - 1;
                curr = curr.right;
            }
        }
        return null;
    }
}
