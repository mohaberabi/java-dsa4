package KMP;

public class KmpLps {


    void fillLps(String s, int[] lps) {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        int n = s.length();
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
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
}
