package KMP;

public class LpsNaive {


    private int findLengthOfLPS(String s, int n) {
        for (int len = n - 1; len > 0; len--) {
            boolean flag = true;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) != s.charAt(n - len + 1)) {
                    flag = false;
                }
            }

            if (flag) {
                return len;
            }
        }

        return 0;
    }


    void fillLps(String s, int[] lps) {
        for (int i = 0; i < s.length(); i++) {
            lps[i] = findLengthOfLPS(s, i + 1);
        }
    }
}
