package Medium;

import Shared.Node;

import java.util.Stack;

public class CanArrayBePreOrderOfBst {


    boolean canArrayBePreORder(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int root = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < root) {
                return false;
            }

            while (!s.isEmpty() && s.peek() < arr[i]) {
                root = s.pop();
            }
            s.push(arr[i]);
        }

        return true;
    }

}
