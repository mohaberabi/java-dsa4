package Medium;

import Shared.Node;

import java.util.Map;
import java.util.TreeMap;

public class BottomView2 {
    void printTopView(Node root) {

        if (root == null) {
            return;
        }


        TreeMap<Integer, Integer> map = new TreeMap<>();

        printTopView(root, map, 0);

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.print(e.getValue() + " ");
        }

    }

    void printTopView(Node root, TreeMap<Integer, Integer> map, int hd) {
        if (root == null) {
            return;
        }
        map.put(hd, root.data);


        printTopView(root.left, map, hd - 1);

        printTopView(root.right, map, hd + 1);

    }
}
