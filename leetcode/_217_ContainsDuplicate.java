import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(mySet.contains(nums[i])){
                return true;
            }else{
                mySet.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(containsDuplicate(nums));
    }
}
