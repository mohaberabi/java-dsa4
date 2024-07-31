import java.util.Stack;

public class ReverseWords {


    String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            stack.push(word + " ");
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }


    void reverseWordsOptimal(String s) {
        int start = 0;
        int n = s.length();
        for (int end = 0; end < n; end++) {
            if (s.charAt(end) == ' ') {
                reverseString(s.toCharArray(), start, end - 1);
                start = end + 1;
            }
        }
        reverseString(s.toCharArray(), start, n - 1);
        reverseString(s.toCharArray(), 0, n - 1);
    }

    void reverseString(char[] s, int start, int end) {

        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
