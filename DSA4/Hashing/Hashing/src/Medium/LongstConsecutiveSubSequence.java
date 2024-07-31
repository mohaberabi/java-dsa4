package Medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongstConsecutiveSubSequence {


    int longestConsecutiveSubSequence(int[] arr) {


        int res = 1;
        int curr = 1;

        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                curr++;
            } else if (arr[i] - arr[i - 1] != 1) {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        return Math.max(res, curr);
    }

    int longestConsecutiveSubSequenceHashing(int[] arr) {

        int res = 1;
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        for (int x : set) {

            if (!set.contains(x - 1)) {
                int curr = 1;
                while (set.contains(x + curr)) {
                    curr++;
                }

                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
