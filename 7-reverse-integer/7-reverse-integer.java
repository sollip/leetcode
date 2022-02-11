class Solution {
 public int reverse(int x) {
        StringBuilder result = new StringBuilder();
        if (x < 0) {
            result.append("-");
        }
        char[] numbers = String.valueOf(x).toCharArray();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != '-') {
                result.append(numbers[i]);
            }
        }

        Long num = Long.valueOf(String.valueOf(result));
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }
        return Math.toIntExact(num);
    }
}