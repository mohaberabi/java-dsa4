import java.util.Arrays;
import java.util.Map;

public class MinimumDifference {


    int minDiff(int[] arr) {
        int n = arr.length;


        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {


            res = Math.min(res, arr[i] - arr[i - 1]);
        }

        return res;
    }
}
