import java.util.Arrays;

public class _1299_Replac_Elements_with_Greatest_Element_on_Right_Side {
    public static int[] replaceElements(int[] arr) {
        int count = 0;
        if (arr.length == 1) {
           return new int [] {-1};
        }
        if (arr[0]<arr[1]){
            arr[0] = arr[1];
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                while (count <= i && arr[i + 1] > arr[i - count]) {
                    arr[i - count] = arr[i + 1];
                    count++;
                }
                count = 0;
            }
             arr[i] = arr[i + 1];
        }
        // for (int i = 0; i < arr.length-1; i++) {
        //     arr[i] = arr[i + 1];
        // }
        arr[arr.length - 1] = -1;

        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {17,16,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
