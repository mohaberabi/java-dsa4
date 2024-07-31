package Medium;

import Shared.Node;

import java.util.ArrayList;

public class SortedArrayToBst {


    static Node sortedArrayToBst(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }


        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = sortedArrayToBst(arr, start, mid - 1);

        root.right = sortedArrayToBst(arr, mid + 1, end);
        return root;

    }


    static void preOrder(Node root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }

        al.add(root.data);
        preOrder(root.left, al);
        preOrder(root.right, al);

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        Node root = sortedArrayToBst(arr, 0, arr.length - 1);
        ArrayList<Integer> al = new ArrayList<>();


        preOrder(root, al);

        for (int x : al) {
            System.out.println(x);
        }
    }

}
