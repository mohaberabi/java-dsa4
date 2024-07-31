package Medium;

import Shared.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SumOfNodesOnSameVerticalLine {


    static class Pair {
        Node node;
        int hd;

        public Pair(Node n, int h) {
            node = n;
            hd = h;
        }
    }

    static void printSumOfNodesOnSameVerticalLine(Node root) {


        HashMap<Integer, Integer> map = new HashMap<>();


        Queue<Pair> q = new LinkedList<>();


        q.add(new Pair(root, 0));


        while (!q.isEmpty()) {
            Pair poll = q.poll();

            Node curr = poll.node;

            if (map.containsKey(poll.hd)) {
                map.put(poll.hd, map.get(poll.hd) + curr.data);
            } else {
                map.put(poll.hd, curr.data);
            }
            if (curr.left != null) {
                q.add(new Pair(curr.left, poll.hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, poll.hd + 1));
            }
        }


        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getValue() + " ");
        }
    }


    static void printVerticalSum(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();


        fillSums(root, map, 0);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getValue() + " ");
        }

    }

    static void fillSums(Node root, HashMap<Integer, Integer> map, int hd) {

        if (root == null) {
            return;
        }
        int curr = map.get(hd) == null ? 0 : map.get(hd);
        map.put(hd, curr + root.data);
        fillSums(root.left, map, hd - 1);
        fillSums(root.right, map, hd + 1);
    }

    public static void main(String[] args) {
        // Let us construct the tree shown above
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Vertical Sums are");
        printVerticalSum(root);
    }

}
