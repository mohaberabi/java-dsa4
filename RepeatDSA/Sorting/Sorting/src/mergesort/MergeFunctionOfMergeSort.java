package mergesort;

public class MergeFunctionOfMergeSort {


    void merge(int[] a, int low, int mid, int high) {
        int n = mid - low + 1;
        int m = high - mid;


        int[] left = new int[n];
        int[] right = new int[m];
        for (int i = 0; i < n; i++) {
            left[i] = a[low + i];
        }
        for (int i = 0; i < m; i++) {
            right[i] = a[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < n) {
            a[k++] = left[i++];

        }
        while (j < m) {
            a[k++] = right[j++];

        }
    }
}
