package selectionsort;

public class SelectionSort {


    void selectionSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            temp[i] = arr[minIndex];
            arr[minIndex] = Integer.MAX_VALUE;
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }

}
