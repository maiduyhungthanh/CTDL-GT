import java.util.Arrays;

public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int[] x = new int[arr.length * 2];
       
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                x[i + count] = arr[i];
            } else {
                x[i + count + 1] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
