import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class _1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> test = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            test.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] * 2 != target) {
                if (test.contains(target - nums[i])) {
                    list.add(i);
                }
            }
            if (nums[i] * 2 == target) {
                arr.add(i);
            }
        }
        if (arr.size() == 2) {
            result[0] = arr.get(0);
            result[1] = arr.get(1);
        } else {
            result[0] = list.get(0);
            result[1] = list.get(1);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1,3,2,4 };
        int target = 6;
        System.out.println(Arrays.toString( twoSum(nums, target)));
    }
}