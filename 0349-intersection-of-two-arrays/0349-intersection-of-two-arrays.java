import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            if(set1.contains(n))
            set2.add(n);
        }

        int arr[] = new int[set2.size()];
        int index = 0;
        for(int num : set2){
            arr[index] = num;
            index++;
        }
        return arr;
    }
}