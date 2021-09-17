import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        // Set<Integer> mySet = new HashSet<>();
        // List <Integer> myList = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     mySet.add(nums[i]);
        // }
        // for (Integer s : mySet) {
        //     myList.add(s);
        // }
        // myList.sort((o1, o2) -> o1 - o2);
        // for (int i = 0; i < myList.size(); i++) {
        //     nums[i] = myList.get(i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i]);
        // }
        // return mySet.size();
        if(nums.length == 0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int [] nums = {-3,-1,0,0,0,3,3}; 
        System.out.println(removeDuplicates(nums));
    }
}
