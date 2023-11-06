class Solution {
    public String defangIPaddr(String address) {
        String replacedIP = address.replace("." , "[.]");
        return replacedIP;
    }
}