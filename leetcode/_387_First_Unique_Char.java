import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Char {
    public static int firstUniqChar(String s) {
        int result = -1;

        Map<Character, Integer> occurs = new HashMap<>();

        for (int i = 0; i < s.length(); i ++) {
            if (!occurs.containsKey(s.charAt(i))) {
                occurs.put(s.charAt(i), 1);
            } else {
                occurs.put(s.charAt(i), 2);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (occurs.get(s.charAt(i)) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}