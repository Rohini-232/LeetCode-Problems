class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String expression : operations){
            switch(expression){
                case "X++":
                X++;
                break;
                case "X--":
                X--;
                break;
                case "++X":
                ++X;
                break;
                case "--X":
                --X;
                break;

            }
        }
        return X;
    }
}