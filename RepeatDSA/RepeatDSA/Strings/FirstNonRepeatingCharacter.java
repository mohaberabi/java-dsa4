import java.util.Arrays;

public class FirstNonRepeatingCharacter {


    int firstNonRepeatingCharacterNaive(String s) {

        int n = s.length();
        for (int i = 0; i < n; i++) {

            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return i;
            }
        }
        return -1;
    }


    int firsyNonRepeatingOptimal2(String s) {
        int[] firstIndex = new int[256];
        int n = s.length();
        Arrays.fill(firstIndex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (firstIndex[s.charAt(i)] == -1) {
                firstIndex[s.charAt(i)] = i;
            } else {
                firstIndex[s.charAt(i)] = -2;

            }
        }

        for (int i = 0; i < n; i++) {
            if (firstIndex[s.charAt(i)] >= 0) {
                res = Math.min(res, firstIndex[i]);
            }
        }
        return res;
    }

    int firstNonRepeaingCharacterBetter(String s) {
        int n = s.length();
        int[] chars = new int[256];
        for (int i = 0; i < n; i++) {
            chars[s.charAt(i)]++;
        }

        for (int i = 0; i < n; i++) {
            if (chars[s.charAt(i)] == 1) {
                return 1;
            }
        }
        return -1;
    }
}
