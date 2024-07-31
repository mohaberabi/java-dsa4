import java.nio.channels.Pipe;
import java.util.*;

public class DiagonalTraversalOfBinaryTree {


    public static class Pair {
        int dist;
        Node node;

        public Pair(Node n, int d) {
            node = n;
            dist = d;
        }
    }

    static ArrayList<Integer> diagonalTraversal(Node root) {

        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {

            return res;
        }


        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.add(new Pair(root, 0));


        while (!q.isEmpty()) {
            Pair pair = q.poll();

            int dist = pair.dist;
            Node curr = pair.node;
            map.putIfAbsent(dist, new ArrayList<>());
            map.get(dist).add(curr.data);
            if (curr.left != null) {
                q.add(new Pair(curr.left, dist + 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, dist));
            }

        }


        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {


//            for (int x : e.getValue()) {
//                System.out.print(x + " ");
//            }
            res.addAll(e.getValue());
//            System.out.println();
        }

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);

        diagonalTraversal(root);
    }
}
