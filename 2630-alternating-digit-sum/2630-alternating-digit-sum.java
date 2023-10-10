class Solution {
    public int alternateDigitSum(int n) {
        int i=0, sum=0, count=0, rem=0, r=0;
        int temp = n;
        while(temp > 0){
            r = temp%10;
            temp = temp/10;
            count++;
        }
        if(count%2 == 0){
            while(n>0){
                i++;
                if(i%2==0){
                    rem=n%10;
                }else{
                    rem=(n%10)*(-1);
                }
                sum+=rem;
                n=n/10;
            }
        }else{
            while(n>0){
                i++;
                if(i%2==0){
                    rem = (n%10)*(-1);
                }else{
                    rem = n%10;
                }
                sum+=rem;
                n=n/10;
            }
        }
        return sum;
    }
}