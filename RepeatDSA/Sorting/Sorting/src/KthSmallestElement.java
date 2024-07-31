import java.util.Arrays;

public class KthSmallestElement {


    int kthSmallestElementNaive(int[] arr, int k) {

        Arrays.sort(arr);
        return arr[k - 1];
    }


    int kthSmallestElementUsingPartitionOFQuickSort(int[] arr, int k) {


        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int pivot = partitionLumeto(arr, low, high);
            if (pivot == k - 1) {
                return pivot;
            } else if (pivot > k - 1) {
                high = pivot - 1;
            } else {
                low = pivot + 1;
            }
        }
        return -1;
    }


    int partitionLumeto(int[] arr, int low, int high) {


        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;

                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }


    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
