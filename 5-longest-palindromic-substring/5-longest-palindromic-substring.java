class Solution {
    
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String temp = String.valueOf(s.charAt(i));
            String result1 = getPalindrome(s, i, i + 1);
            String result2 = getPalindrome(s, i - 1, i + 1);
            if (result1.length() == 0 && result2.length() == 0) {
                result = temp;
            } else {
                int max = Math.max(result1.length(), result2.length());
                if (max > result.length()) {
                    result = result1.length() > result2.length() ? result1 : result2;
                }
            }
        }
        return result;
    }

    public String getPalindrome(String str, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > str.length() - 1 || str.charAt(startIndex) != str.charAt(endIndex)) {
            return str.substring(startIndex + 1, endIndex);
        }
        return getPalindrome(str, startIndex - 1, endIndex + 1);
    }
}