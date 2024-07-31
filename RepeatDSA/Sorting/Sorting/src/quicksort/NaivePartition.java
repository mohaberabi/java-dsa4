package quicksort;

public class NaivePartition {


    void partition(int[] arr, int low, int high, int pivotIndex) {
        int[] temp = new int[high - low + 1];

        int index = 0;

        for (int i = low; i <= high; i++) {
            if (arr[i] <= arr[pivotIndex]) {
                temp[index++] = arr[i];
            }
        }

        for (int i = low; i <= high; i++) {
            if (arr[i] > arr[pivotIndex]) {
                temp[index++] = arr[i];
            }
        }


        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

    }
}
