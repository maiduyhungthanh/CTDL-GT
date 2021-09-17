public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String x = String.valueOf(nums[i]);
            if (x.length() % 2 == 0) {
                count++;
         }
    }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 22, 333, 4444 };
        System.out.println( findNumbers(nums));
    }
}
