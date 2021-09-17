import java.util.HashSet;
import java.util.Set;

public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        Set<Integer> mySet = new HashSet<>();
        mySet.add(val);
        for (int i = 0; i < nums.length; i++) {
            if (!mySet.contains(nums[i])) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return j;
    }
public static void main(String[] args) {
    int[] nums = { 3, 2, 2, 3 };
    int val = 3;
    System.out.println(removeElement(nums, val));
}
}
