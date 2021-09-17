import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        if (c[0] == '}' || c[0] == ']' || c[0] == ')') {
            return false;
        } else if (c[0] == '{' || c[0] == '[' || c[0] == '(') {
            st.push(c[0]);
        }
        for (int i = 1; i < c.length; i++) {
            if (c[i] == '{' || c[i] == '[' || c[i] == '(') {
                st.push(c[i]);
            }else if (c[i] == '}'&& st.empty() || c[i] == ']'&& st.empty() || c[i] == ')' && st.empty()) {
                return false;
            }else if (c[i] == '}' && st.peek() == '{' || c[i] == ']' && st.peek() == '['
                    || c[i] == ')' && st.peek() == '(') {
                st.pop();
            } else {
                return false;
            }
        }
        if (!st.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }
}
