class Solution {
    public int subtractProductAndSum(int n) {
        int rem =0;
        int prod = 1;
        int sum = 0;
        while(n != 0){
            rem = n%10;
            n= n/10;
            prod*=rem;
            sum+=rem;
        }
        return prod-sum;
    }
}