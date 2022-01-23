class Solution {
   public int lengthOfLongestSubstring(String input) {
        int startIndex = 0;
        int output = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            for (int j = startIndex; j < i; j++) {
                if (input.charAt(j) == current) {
                    startIndex = j + 1;
                }
            }
            int length = i - startIndex + 1;
            output = length > output ? length : output;
        }
        return output;
    }
}