package RabinKarb;

public class RabinKarb {

    private static final int q = 101;
    private static final int d = 256;

    public RabinKarb() {
    }

    void RBSearch(String pat, String txt) {

        int M = pat.length();
        int N = txt.length();
        int h = 1;
        for (int i = 1; i <= M - 1; i++)
            h = (h * d) % q;

        int p = 0, t = 0;
        for (int i = 0; i < M; i++) {
            p = (p * d + pat.charAt(i)) % q;
            t = (t * d + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= (N - M); i++) {
            if (p == t) {
                boolean flag = true;
                for (int j = 0; j < M; j++)
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                if (flag) System.out.print(i + " ");
            }
            if (i < N - M) {
                t = ((d * (t - txt.charAt(i) * h)) + txt.charAt(i + M)) % q;
                if (t < 0) t = t + q;
            }
        }
    }

    void printIndexOfPattern(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int h = 1;

        for (int i = 0; i <= m - 1; i++) {
            h = (h * d) % q;
        }
        int patternHash = 0;
        int txtHash = 0;

        for (int i = 0; i < m; i++) {
            patternHash = (patternHash * d + pat.charAt(i)) % q;
            txtHash = (txtHash * d + txt.charAt(i)) % q;
        }
        for (int i = 0; i <= (n - m); i++) {
            if (patternHash == txtHash) {
                boolean matched = true;
                for (int j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        matched = false;
                        break;
                    }
                }
                if (matched) {
                    System.out.println("FOUND THE OCCURRENCE OF THE PATTERN AT INDEX " + i);
                }
            }
            if (i < (n - m)) {
                txtHash = ((d * (txtHash - txt.charAt(i) * h)) + txt.charAt(i + m)) % q;
                if (txtHash < 0) {
                    txtHash = txtHash + q;
                }
            }
        }
    }

    public static void main(String[] args) {
        RabinKarb rabinKarb = new RabinKarb();
        String txt = "abdabcbabc";
        String pat = "abc";
        rabinKarb.RBSearch(pat, txt);
    }
}
