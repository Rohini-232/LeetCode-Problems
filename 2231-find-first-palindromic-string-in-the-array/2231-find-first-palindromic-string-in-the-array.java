class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(checkPalindrome(s))
            return s;
        }
        return "";
    }
    public boolean checkPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}