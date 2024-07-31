package Medium;

import Shared.Node;

import java.util.*;

public class BoundryTraversal {


    static boolean isLeaf(Node root) {

        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    public static ArrayList<Integer> boundryTraversal(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> res = new ArrayList<>();

        if (!isLeaf(root)) {
            res.add(root.data);
        }

        Node curr = root.left;
        while (curr != null) {

            if (!isLeaf(curr)) {
                res.add(curr.data);
            }

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }

        }

        curr = root.right;


        Stack<Integer> right = new Stack<>();
        while (curr != null) {
            if (!isLeaf(curr)) {
                right.push(curr.data);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }


        ArrayList<Integer> leafs = new ArrayList<>();

        fillLeaves(root, leafs);

        res.addAll(leafs);
        while (!right.isEmpty()) {

            res.add(right.pop());
        }

        return res;
    }


    static void fillLeaves(Node root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }

        if (isLeaf(root)) {
            al.add(root.data);
            return;
        }

        fillLeaves(root.left, al);
        fillLeaves(root.right, al);
    }

    public static void main(String[] args) {
        Node tree = new Node(20);

        tree.left = new Node(8);
        tree.left.left = new Node(4);
        tree.left.right = new Node(12);
        tree.left.right.left = new Node(10);
        tree.left.right.right = new Node(14);
        tree.right = new Node(22);
        tree.right.right = new Node(25);

        ArrayList<Integer> boundr = boundryTraversal(tree);

        for (int x : boundr) {
            System.out.print(x + " ");
        }
    }
}
