package Hard;

import Shared.Node;

public class ConvertBinaryTreeToDoubleLinkedList {


    static class Holder {
        Node prev;

        public Holder() {
            prev = null;
        }
    }


    Node fromBinaryTreeToDoubleLinkedList(Node root, Holder holder) {
        if (root == null) {
            return null;
        }

        Node head = fromBinaryTreeToDoubleLinkedList(root.left, holder);
        if (holder.prev == null) {
            head = root;
        } else {
            root.left = holder.prev;
            holder.prev.right = root;
        }

        fromBinaryTreeToDoubleLinkedList(root.right, holder);
        return head;
    }
}
