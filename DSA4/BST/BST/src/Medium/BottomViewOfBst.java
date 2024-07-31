package Medium;

import Shared.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBst {
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

        Queue<TopViewOfBinaryTree2.Pair> q = new LinkedList<>();

        q.add(new TopViewOfBinaryTree2.Pair(0, root));
        while (!q.isEmpty()) {
            TopViewOfBinaryTree2.Pair p = q.poll();

            map.put(p.hd, p.node.data);

            if (p.node.left != null) {
                q.add(new TopViewOfBinaryTree2.Pair(p.hd - 1, p.node.left));
            }
            if (p.node.right != null) {
                q.add(new TopViewOfBinaryTree2.Pair(p.hd + 1, p.node.right));

            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.print(e.getValue() + " ");
        }

    }
}
