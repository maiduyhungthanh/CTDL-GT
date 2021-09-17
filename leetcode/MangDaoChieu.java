import java.util.Arrays;

public class MangDaoChieu {
    
    public static void swap(String[] arr, int i, int j) {
        //Điều kiện dừng i>=j
        if (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            swap(arr, i+1, j-1);
        }
    }   

    public static void reverseString(String[] input) {
        swap(input, 0, input.length - 1);
    }

        public static void main(String[] args) {
        MangDaoChieu test = new MangDaoChieu();
        String[] input = { "Hoa", "Khiem", "Son", "Tung", "Manh", "Cuong", "Vu", "Thanh", "Chinh" };
        System.out.println("Mảng ban đầu :");
        System.out.println(Arrays.toString(input));
        System.out.println("Mảng đổi chiều");
        test.reverseString(input);
        System.out.println(Arrays.toString( input));
    }
}
