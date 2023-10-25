class Solution {
    public int smallestEvenMultiple(int n) {
        int num=1;
        while(num>=1){
            if(num%2==0 && num%n==0){
                return num;
            }
            num++;
        }
        return num;
    }
}