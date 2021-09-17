public class _9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0 || x%10 ==0)
            return false;
        if (x >= 0 && x < 10)
            return true;
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "12213";
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        System.out.println(rev);
    }
}
