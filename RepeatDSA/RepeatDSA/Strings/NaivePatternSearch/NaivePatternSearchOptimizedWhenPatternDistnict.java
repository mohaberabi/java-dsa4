package NaivePatternSearch;

public class NaivePatternSearchOptimizedWhenPatternDistnict {


    void printIndexOfWherePatternDiffernt(String txt, String pat) {


        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {

                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println("Found Pattern At " + " " + i);
            }
            if (j == 0) {
                i++;
            } else {
                i = (i + j);
            }
        }
    }
}
