public class SegragateEvenOdd {

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void segragatePosNegHoars(int[] arr) {
        int n = arr.length;
        int i = -1;
        int j = n - 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);


            do {
                j--;
            } while (arr[j] > 0);

            if (i >= j) {
                return;
            }

            swap(arr, i, j);
        }


    }

    void segragatePosNeg(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[i] < 0) {
                temp[i++] = arr[j];
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[i] > 0) {
                temp[i++] = arr[j];
            }
        }
        for (int j = 0; j < n; j++) {
            arr[i] = temp[i];
        }


    }
}
