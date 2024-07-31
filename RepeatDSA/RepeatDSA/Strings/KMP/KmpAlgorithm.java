package KMP;

public class KmpAlgorithm {


    public KmpAlgorithm() {

    }

    void kmp(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();
        int[] lps = new int[m];
        fillLps(pat, lps);
        int i = 0;
        int j = 0;

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                System.out.println(i - j);
                j = lps[j - 1];
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }
        }
    }

    void fillLps(String txt, int[] lps) {

        lps[0] = 0;
        int i = 1;

        int len = 0;
        int n = txt.length();
        while (i < n) {
            if (txt.charAt(i) == txt.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }


    }

    public static void main(String[] args) {


        String pat = "ababa";
        String txt = "ababcababaad";
        KmpAlgorithm kmp = new KmpAlgorithm();
        kmp.kmp(pat, txt);
    }
}
