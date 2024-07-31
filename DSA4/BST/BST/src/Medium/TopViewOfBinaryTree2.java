package Medium;

import Shared.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree2 {


    static class Pair {
        int hd;
        Node node;


        public Pair(int h, Node n) {
            hd = h;
            node = n;
        }
    }


    void printTopView(Node root) {


        if (root == null) {
            return;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair p = q.poll();

            if (!map.containsKey(p.hd)) {
                map.put(p.hd, p.node.data);
            }

            if (p.node.left != null) {
                q.add(new Pair(p.hd - 1, p.node.left));
            }
            if (p.node.right != null) {
                q.add(new Pair(p.hd + 1, p.node.right));

            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.print(e.getValue() + " ");
        }

    }


}
