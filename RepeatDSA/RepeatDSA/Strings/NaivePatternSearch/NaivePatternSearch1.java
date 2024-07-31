package NaivePatternSearch;

public class NaivePatternSearch1 {


    void printIndexOf(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        int bound = n - m;
        for (int i = 0; i <= bound; i++) {
            int j;
            for (j = 0; j < m; j++) {

                char currText = txt.charAt(i + j);
                char currPat = pat.charAt(j);
                if (currText != currPat) {
                    break;
                }
            }
            if (j == m) {
                System.out.println("FOUND THE PATTERN AT " + " " + i);
            }
        }
    }
}
