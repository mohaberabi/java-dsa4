package Traversals;

import Shared.Node;

import java.util.*;

public class VerticalTraversal {


    static class Pair {
        Node node;
        int hd;

        public Pair(Node n, int h) {
            node = n;
            hd = h;
        }
    }


    static void printVerticalTraversal(Node root) {

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        while (!q.isEmpty()) {
            Pair pair = q.poll();

            int hd = pair.hd;

            Node curr = pair.node;

            ArrayList<Integer> al;
            if (map.containsKey(hd)) {
                al = map.get(hd);
            } else {
                al = new ArrayList<>();

            }
            al.add(curr.data);
            map.put(hd, al);


            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));

            }
        }


        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {


            for (int x : e.getValue()) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    static void printVerticalTraversalRec(Node root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        printVerticalTraversalRecUtil(root, 0, map);
        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {


            for (int x : e.getValue()) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

    static void printVerticalTraversalRecUtil(Node root, int hd, TreeMap<Integer, ArrayList<Integer>> map) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> al;
        if (map.containsKey(hd)) {
            al = map.get(hd);
        } else {
            al = new ArrayList<>();

        }
        al.add(root.data);
        map.put(hd, al);

        printVerticalTraversalRecUtil(root.left, hd - 1, map);
        printVerticalTraversalRecUtil(root.right, hd + 1, map);

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printVerticalTraversal(root);
    }
}
