public class SortArrayWithZeroOneTwo {


    void sortArrayWithZeroOneTwo(int[] arr) {

        int n = arr.length;
        int low = 0;
        int mid = 0;
        int hi = n - 1;

        while (mid <= hi) {


            if (arr[mid] == 0) {
                swap(low, hi, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(mid, hi, arr);
                hi--;
            }
        }
    }


    void swap(int i, int j, int[] arr) {
        int temp = arr[i];


        arr[i] = arr[j];
        arr[j] = temp;
    }


}
