package quicksort;

public class QuickSortHoars {


    void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    void quickSort(int[] arr, int low, int high) {
        if (high > low) {

            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot);

            quickSort(arr, pivot + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {

        int i = low - 1;
        int j = high + 1;

        int pivot = arr[low];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            }
            while (arr[j] > pivot);

            if (i <= j) {
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
