package quicksort;

public class LumetoPartition {


    int lumetoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;


        for (int j = low; j <= high - 1; j++) {
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
