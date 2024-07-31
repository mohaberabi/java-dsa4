import java.util.Arrays;

public class FirstRepeatingCharacter {


    int firstRepeatingCharacterNaive(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

    int firstRepeatingCharacterOptimal3(String s) {
        boolean[] visited = new boolean[256];
        int res = -1;

        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (visited[s.charAt(i)]) {
                res = i;
            } else {
                visited[s.charAt(i)] = true;
            }
        }
        return res;
    }

    int firstRepeatingCharacterOptimal2(String s) {
        int[] firstIndex = new int[256];
        int res = Integer.MAX_VALUE;
        Arrays.fill(firstIndex, -1);

        int n = s.length();
        for (int i = 0; i < n; i++) {
            int index = firstIndex[s.charAt(i)];

            if (index != -1) {
                res = Math.min(res, index);
            } else {
                firstIndex[s.charAt(i)] = i;
            }
        }
        return res;
    }

    int firstRepeatingCharacterOptimal1(String s) {
        int[] freq = new int[256];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < n; i++) {
            if (freq[s.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }
}
