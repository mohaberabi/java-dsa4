public class CountInversions {


    int inversionsNaive(int[] arr) {
        int n = arr.length;


        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    res++;
                }
            }
        }
        return res;
    }


    int countInversions(int[] arr) {
        int n = arr.length;
        int res = countInversions(arr, 0, n - 1);
        return res;
    }

    int countInversions(int[] arr, int l, int r) {
        int res = 0;
        if (r > l) {

            int mid = (l + r) / 2;
            res += countInversions(arr, l, mid);
            res += countInversions(arr, mid + 1, r);
            res += countAndMerge(arr, l, mid, r);
        }
        return res;

    }

    int countAndMerge(int[] arr, int low, int mid, int high) {

        int n = mid - low + 1;
        int m = high - mid;

        int left[] = new int[n];
        int right[] = new int[m];

        for (int i = 0; i < n; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < m; i++) {
            right[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int res = 0;
        while (i < n && j < m) {

            if (left[i] <= right[j]) {

                arr[k] = left[i++];
            } else {

                arr[k] = right[j++];
                res = res + (n - i);
            }
            k++;
        }

        while (i < n) {
            arr[k++] = left[i++];

        }
        while (j < m) {
            arr[k++] = right[j++];

        }
        return res;
    }
}
