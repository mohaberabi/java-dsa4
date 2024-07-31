package Medium;

import Shared.Node;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalSumOfBst {


    static class Pair {
        int hd;
        Node node;


        public Pair(int d, Node n) {
            hd = d;
            node = n;
        }
    }

    void printVerticalSumOfBST(Node root) {

        if (root == null) {
            return;
        }
        Queue<Pair> q = new LinkedList<>();


        TreeMap<Integer, Integer> map = new TreeMap<>();


        q.add(new Pair(0, root));
        while (!q.isEmpty()) {

            Pair pair = q.poll();

            int dist = pair.hd;
            Node curr = pair.node;


            if (map.containsKey(dist)) {
                int sum = map.get(dist);
                map.put(dist, sum + root.data);
            } else {
                map.put(dist, root.data);

            }


            if (curr.left != null) {
                q.add(new Pair(dist - 1, curr));
            }
            if (curr.right != null) {
                q.add(new Pair(dist + 1, curr));
            }
        }


        for (Map.Entry<Integer, Integer> e : map.entrySet()) {

            System.out.println(e.getValue());
        }

    }


    void printVerticalSum(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();


        printVerticalSum(root, map, 0);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {

            System.out.println(e.getValue());
        }
    }


    void printVerticalSum(Node root, TreeMap<Integer, Integer> map, int hd) {
        if (root == null) {
            return;
        }

        if (map.containsKey(hd)) {
            map.put(hd, map.get(hd) + root.data);
        } else {
            map.put(hd, root.data);
        }


        printVerticalSum(root.left, map, hd - 1);
        printVerticalSum(root.right, map, hd + 1);

    }
}
