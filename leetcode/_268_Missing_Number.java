public class _268_Missing_Number {
    public int missingNumber(int[] nums) {
        int total = 0;
        int missNumber = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        sum = (nums.length) * (nums.length + 1) / 2;
        missNumber = sum - total;
        return missNumber;
    }
    public static void main(String[] args) {
        _268_Missing_Number test = new _268_Missing_Number();
        int[] nums = { 9,6,4,2,3,5,7,0,1 };
        test.missingNumber(nums);
        System.out.println(test.missingNumber(nums));
    }
}
