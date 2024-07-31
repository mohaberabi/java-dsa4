package quicksort;

import java.util.Random;

public class QuickSortPractical {


    private final boolean isLumeto;

    public QuickSortPractical() {

        isLumeto = false;
    }

    public QuickSortPractical(boolean isLumeto) {

        this.isLumeto = isLumeto;
    }


    void quickSort(int[] arr) {
        int n = arr.length;
        Random random = new Random();
        int randomPivotIndex = random.nextInt(n);


        if (isLumeto) {
            swap(arr, randomPivotIndex, n - 1);

        } else {
            swap(arr, randomPivotIndex, 0);

        }


        quickSort(arr, 0, n - 1);
    }

    void quickSort(int[] arr, int low, int high) {

        if (low < high) {


            int pivot =
                    isLumeto ? partitionLumeto(arr, low, high) :
                            partitionHoars(arr, low, high);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot + 1, high);
        }

    }


    // using hoars partition
    int partitionHoars(int[] arr, int low, int high) {
        int i = low - 1;
        int j = high + 1;


        int pivot = arr[low];
        while (true) {
            do {

                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }

            swap(arr, i, j);
        }

    }


    int partitionLumeto(int[] arr, int low, int high) {
        int pivot = arr[high];


        int i = low - 1;


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


    public static void main(String[] args) {
        int[] arr = {9000, 1, 0, -7, 22, 7, 4};

        QuickSortPractical qs = new QuickSortPractical();
        qs.quickSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
