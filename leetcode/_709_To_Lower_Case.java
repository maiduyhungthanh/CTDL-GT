import java.util.Arrays;

public class _709_To_Lower_Case {
      public String toLowerCase(String s) {
              for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch > 64 && ch < 91) {
                ch = ch + 32;
              System.out.print( (char) ch);
            }
               else if(ch>96&&ch<123) {
                System.out.print( (char) ch);
            }
            
            System.out.print(" ");
        }
        return s;
    }
    
    public static void main(String[] args) {
        String s = "HELlo";
        _709_To_Lower_Case lower = new _709_To_Lower_Case();
        lower.toLowerCase(s);

    }
}