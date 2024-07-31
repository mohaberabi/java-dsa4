package Medium;

import Shared.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopOfViewOfBinaryTree {


    static class Pair {
        int hd;
        Node node;

        public Pair(Node n, int h) {

            node = n;
            hd = h;
        }
    }


    void printTopViewOfBinaryTree(Node root) {


        if (root == null) {
            return;
        }

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair pair = q.poll();


            if (!map.containsKey(pair.hd)) {
                map.put(pair.hd, pair.node.data);

            }
            if (pair.node.left != null) {
                q.add(new Pair(pair.node.left, pair.hd - 1));
            }
            if (pair.node.right != null) {
                q.add(new Pair(pair.node.right, pair.hd + 1));

            }
        }


        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.print(e.getValue() + " ");
        }
    }
}
