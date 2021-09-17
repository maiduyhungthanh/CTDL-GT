import java.util.Arrays;

public class _1470_Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
     int[] kq = new int[2*n];

        int x = 0;
        int y = n;

        int i = 0;
        for (int k = 0; k < n; k++) {
             kq[i] = nums[x];
            i++;x++;
            kq[i] = nums[y];
            i++;y++;
        }

        return kq;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2 };
        _1470_Shuffle_the_Array test = new _1470_Shuffle_the_Array();
        test.shuffle(nums, 2);
        System.out.println(Arrays.toString (test.shuffle(nums, 2)));
    }
}
