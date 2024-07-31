package mergesort;

public class PrintTwoSortedArrayAsMerged {


    void printTwosortedArrayAsMerged(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                System.out.println(a[i++]);
            } else {
                System.out.println(b[j++]);

            }
        }

        while (i < n) {
            System.out.println(a[i++]);

        }
        while (j < m) {
            System.out.println(b[j++]);

        }
    }
}
