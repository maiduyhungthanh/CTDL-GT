import java.util.Arrays;

public class _66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int[] q = new int[digits.length + 1];
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        if (digits.length == 2 && digits[0] == 9 && digits[1] == 9) {
            return new int[] { 1, 0, 0 };
        }
         if (digits.length == 1 && digits[0] == 9) {
            return new int[] {1,0};
        }
        int a = 1;
        if (digits[digits.length - 1] == 9) {
            digits[digits.length - 1] = 0;
            while (digits[digits.length - 1 - a] == 9 && digits.length - 1 - a >0) {
                digits[digits.length - 1 - a] = 0;
                a++;
                if (digits.length - 1 - a == 0 && digits[digits.length - 1 - a] == 9) {
                   q = Arrays.copyOfRange(digits,0 , digits.length+1);
                   q[0] = 1;
                   return q;
                }
            }
            digits[digits.length - 1 - a] = digits[digits.length - 1 - a] + 1;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = { 9};
        int[] a = new int[digits.length + 1];
        // a = Arrays.copyOfRange(digits, 0, digits.length+1);
        // // a[a.length - 1] = 0;
        // System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString( plusOne(digits)));
    }
}