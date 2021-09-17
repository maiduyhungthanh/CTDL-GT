import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _28_Implement_strStr{
    public static int strStr(String haystack, String needle) {
        Map<String, Integer> myMap = new HashMap<>();
        int n = haystack.length();
        int m = needle.length();
        if (n < m) {
            return -1;
        }
        if (n > 0 && m == 0 || haystack.equals(needle)) {
            return 0;
        }
        // for (int i = 0; i < n; i++) {
        //     if (haystack.charAt(i) == needle.charAt(0) && n - i >= m) {
        //         String s = haystack.substring(i, i + m);
        //         if (!myMap.containsKey(s)) {
        //             myMap.put(s, i);
        //         }
        //     }
        // }
        // Set<String> list = myMap.keySet();
        // for (String s : list) {
        //     if (s.equals(needle)) {
        //         return myMap.get(s);
        //     }
        // }
        for(int i = 0; i < n; i++){
            
            if(haystack.charAt(i) == needle.charAt(0)  && n - i >= m ){
                if(haystack.substring(i,i + m).equals(needle)){
                    return i;
                    
                }
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "aaa";
        String needle = "a";
        // System.out.println(strStr(haystack, needle));
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    //     int target = 7;
    //    int index = Arrays.binarySearch(nums,target);
    //     // if(index>=0){
        //    System.out.println(index);
        // }
        // else {
        //     index = (index + 1) * (-1);
        //     System.out.println(index);
        // }
        // int[] arrInt = { -6, -1, 0, 2, 2, 4, 8, 9, 10, 16 };
        	
        // int indx = Arrays.binarySearch(arrInt, 4);
        // System.out.println(index);

        if(nums == null || nums.length < 1) {
           System.out.println("No");
        }
        int currSum = nums[0], maxSum = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(currSum < 0) {
                currSum = 0;
            }
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
