public class IntersectionOfTwoSortedArrays {


    void printIntersectionsOfTwoSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {

            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }
}
