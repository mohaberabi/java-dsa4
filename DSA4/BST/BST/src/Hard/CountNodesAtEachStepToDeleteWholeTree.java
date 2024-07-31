package Hard;

import Shared.Node;
import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CountNodesAtEachStepToDeleteWholeTree {


    ArrayList<Integer> nodesAtEachStep(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> res = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        count(root, map);
        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            res.add(e.getValue().size());
        }
        return res;
    }

    int count(Node root, TreeMap<Integer, ArrayList<Integer>> map) {
        if (root == null) {
            return 0;
        }
        int left = count(root.left, map);
        int right = count(root.right, map);
        int max = 1 + Math.max(left, right);

        if (map.containsKey(max)) {
            map.get(max).add(root.data);
        } else {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            map.put(max, al);
        }

        return max;
    }

    
}
