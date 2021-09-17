import java.util.Arrays;

public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
         if(arr.length < 3){
            return false;
        }
        int[] x = Arrays.copyOf(arr, arr.length);
        Arrays.sort(x);
        if (x[x.length - 1] == arr[arr.length - 1] || x[x.length - 1] == arr[0]) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x[x.length - 1]) {
                count = i;
                break;
            }
        }
          for (int i = 0; i < arr.length-1; i++) {
            if (i < count && arr[i] >= arr [i+1]) {
                return false;
            } else if (i >= count && arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1};
        System.out.println(validMountainArray(arr));
    }
}
