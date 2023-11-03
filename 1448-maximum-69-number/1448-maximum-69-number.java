class Solution {
    public int maximum69Number (int num) {
         String str = Integer.toString(num);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '6') {
                charArray[i] = '9';
                return Integer.parseInt(String.valueOf(charArray));
            }
        }
        return num;
    }
}