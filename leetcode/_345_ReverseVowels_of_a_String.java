import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class _345_ReverseVowels_of_a_String {
    public static String reverseVowels(String s) {
        Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        Stack<Character> stack = new Stack<>();
        List<Character> list =  Arrays.asList(vowels);
        StringBuilder str = new StringBuilder(); 
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))){
              stack.push(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))){
                str.append(stack.pop());
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "leetcodeiu";
        System.out.println(reverseVowels(s));
    
    }
}
