package Medium;

import Shared.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ReplaceWithAllGreater {


    void replaceWithAllGreater(Node root) {


        fillReverseOrderOfBst(root);

    }

    int sum = 0;

    void fillReverseOrderOfBst(Node root) {
        if (root == null) {
            return;
        }

        fillReverseOrderOfBst(root.right);


        if (sum == 0) {
            sum += root.data;
            root.data = 0;
        } else {
            sum += root.data;
            root.data = sum;
        }

        fillReverseOrderOfBst(root.left);

    }
}
