import java.util.HashMap;

public class DiameterOFBiTree {


    int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }


    int diameterNaive(Node root) {
        if (root == null) {
            return 0;
        }

        int d1 = 1 + height(root.right) + height(root.left);

        int d2 = diameterNaive(root.left);
        int d3 = diameterNaive(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }


    /**
     * end of the naive functions to get diameter
     */

    /**
     * now method 2 is using the hashing to precompute the heights to get them in big o of 1
     */

    int diameter(Node root) {


        HashMap<Node, Integer> heights = new HashMap<>();

        fillHeight(root, heights);

        return diameterUtil(root, heights);
    }

    void fillHeight(Node root, HashMap<Node, Integer> map) {

        if (root == null) {
            return;
        }
        int left = height(root.left);
        int right = height(root.right);
        map.put(root, 1 + Math.max(left, right));
    }

    int diameterUtil(Node root, HashMap<Node, Integer> map) {
        if (root == null) {
            return 0;
        }
        int d1 = map.get(root.left) + map.get(root.right);
        int d2 = diameterUtil(root.left, map);
        int d3 = diameterUtil(root.right, map);

        return Math.max(d1, Math.max(d2, d3));

    }

    /**
     * but we still have more better solution
     * as the method 2 requires extra verhead and O(n) space also
     * so the next method is depends on height function so we need to modify it
     * while travelling the height function
     */


    class Holder {
        int res;

        public Holder() {
            res = 0;
        }
    }


    int getDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        Holder res = new Holder();
        int di = getHeightAndComputeDiameter(root, res);
        return res.res;
    }

    int getHeightAndComputeDiameter(Node root, Holder holder) {
        if (root == null) {
            return 0;
        }
        int left = getHeightAndComputeDiameter(root.left, holder);
        int right = getHeightAndComputeDiameter(root.right, holder);
        holder.res = Math.max(holder.res, 1 + left + right);
        return 1 + Math.max(left, right);
    }

}
