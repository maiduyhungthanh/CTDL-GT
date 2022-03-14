import java.util.HashMap;
import java.util.Map;

public class _219_ContainsDuplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(myMap.containsKey(current) && Math.abs(myMap.get(current) - i) <=k){
                return true;
            }else{
                myMap.put(current, i);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
