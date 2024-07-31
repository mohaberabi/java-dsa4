public class IsPlaindrome {


    boolean isPalindromeNaive(String s) {
        StringBuilder rev = new StringBuilder(s);

        rev.reverse();
        return rev.equals(s);
    }


    boolean isPalindromeOptimal(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
