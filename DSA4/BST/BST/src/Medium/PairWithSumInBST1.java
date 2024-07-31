package Medium;

import Shared.Node;

import java.util.ArrayList;

public class PairWithSumInBST1 {


    boolean doesPairExist(Node root, int sum) {
        if (root == null) {
            return false;
        }


        ArrayList<Integer> inOrder = new ArrayList<>();
        buildInOrder(root, inOrder);


        int low = 0;
        int high = inOrder.size() - 1;

        while (low <= high) {
            int curr = inOrder.get(low) + inOrder.get(high);
            if (curr == sum) {
                return true;
            } else if (curr > sum) {
                high--;
            } else {
                low++;
            }

        }
        return false;
    }

    void buildInOrder(Node root, ArrayList<Integer> inOrder) {


        if (root == null) {
            return;
        }

        buildInOrder(root.left, inOrder);
        inOrder.add(root.data);
        buildInOrder(root.right, inOrder);

    }
}
