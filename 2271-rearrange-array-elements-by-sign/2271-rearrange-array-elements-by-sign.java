class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int posidx=0 , negidx=1;
        
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                arr[posidx] = nums[i];
                posidx+=2;
            }else{
                arr[negidx] = nums[i];
                negidx+=2;
            }
        } 
        return arr;
    }
}