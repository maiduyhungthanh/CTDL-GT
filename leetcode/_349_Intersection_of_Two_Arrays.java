
import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

public class _349_Intersection_of_Two_Arrays {
     public static int[] intersection(int[] nums1, int[] nums2) {
          Set<Integer> set = new HashSet<>();
          Set<Integer> mySet = new HashSet<>();

         for (Integer a : nums2) {
             mySet.add(a);
         }
         for (Integer b : nums1) {
             if(mySet.contains(b)){
                 set.add(b);
             }
         }
         int[] num = new int[set.size()];
         int j = 0;
         for (int x : set) {
             num[j] = x;
             j++;
         }
         return num;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString( intersection(nums1,nums2)));
    }
}
