class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String str1 = str[str.length - 1];
        int value = str1.length();
        return value;
    }
}
