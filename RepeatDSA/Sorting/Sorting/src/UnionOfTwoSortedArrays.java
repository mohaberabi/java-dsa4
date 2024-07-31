public class UnionOfTwoSortedArrays {


    void printUnionOfTwoSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (i > 0 && a[i] == a[i - 1]) {

                i++;
                continue;
            }

            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;

            } else if (a[i] > b[j]) {
                System.out.println(b[j]);
                j++;
            } else {
                System.out.println(b[j]);
                j++;
                j++;
            }
        }

        while (i < n) {
            System.out.println(a[i]);
            i++;
        }

        while (j < m) {
            System.out.println(b[j]);
            j++;
        }

    }
}
