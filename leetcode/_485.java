public class _485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int countMax = 0;

        for (int i = 0; i < nums.length; i++) {
            count = (nums[i] == 1) ? (count + 1) : (0);
            countMax = (countMax < count) ? (count) : (countMax);
        }
        return countMax;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
