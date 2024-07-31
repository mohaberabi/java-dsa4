package Medium;

import Shared.Node;

import java.util.*;

public class VerticalTraversalOfBst {


    static class Pair {
        int hd;
        Node node;


        public Pair(int h, Node n) {
            hd = h;
            node = n;
        }
    }


    void printVerticalTraversal(Node root) {


        if (root == null) {
            return;
        }
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();


        q.add(new Pair(0, root));

        while (!q.isEmpty()) {


            Pair pair = q.poll();
            Node curr = pair.node;
            int hd = pair.hd;
            ArrayList<Integer> al;
            if (map.containsKey(hd)) {
                al = map.get(hd);
            } else {
                al = new ArrayList<>();
            }
            al.add(curr.data);
            map.put(hd, al);


            if (curr.left != null) {
                q.add(new Pair(hd - 1, curr.left));
            }
            if (curr.right != null) {
                q.add(new Pair(hd + 1, curr.right));
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {

            for (int x : e.getValue()) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
