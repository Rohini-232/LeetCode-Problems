class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list1 = new ArrayList<>();

        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                list1.add(nums1[i]);
                i++;
                j++;
            }
        }

        int result[] = new int[list1.size()];
        int index = 0;
        for(int num : list1){
            result[index] = num;
            index++;
        }
        return result;
    }
}