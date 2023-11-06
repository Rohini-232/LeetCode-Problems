class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxVal = candies[0];

        for(int i=0; i<candies.length; i++){
            maxVal = Math.max(maxVal , candies[i]);
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= maxVal){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}