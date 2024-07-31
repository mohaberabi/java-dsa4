package quicksort;

public class HoarsPartition {


    int hoarsPartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            }
            while (arr[i] < pivot);

            do {
                j--;
            }
            while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }
            swap(arr, i, j);

        }
    }


    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
