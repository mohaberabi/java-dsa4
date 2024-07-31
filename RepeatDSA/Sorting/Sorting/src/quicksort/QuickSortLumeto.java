package quicksort;

public class QuickSortLumeto {


    void quickSort(int[] arr) {


        quickSort(arr, 0, arr.length - 1);
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;


        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i, high);
        return i + 1;
    }


    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
