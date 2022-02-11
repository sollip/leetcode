class Solution {
    public int myAtoi(String s) {
        boolean hasSign = false;
        boolean negative = false;
        int cursor = 0;

        List<Integer> numbers = new ArrayList<>();
        char[] chars = s.toCharArray();

        while (cursor < s.length()) {
            char temp = chars[cursor];
              if (temp == ' ' && numbers.size() == 0&& !hasSign) {
                cursor++;
            } else if (temp == '-') {
                if (numbers.size() != 0 || hasSign) {
                    break;
                }
                hasSign = true;
                negative = true;
                cursor++;
            } else if (temp == '+') {
                if (numbers.size() != 0 || hasSign) {
                    break;
                }
                hasSign = true;
                cursor++;
            } else if (48 <= temp && temp <= 57) {
                numbers.add(temp - '0');
                cursor++;
            } else {
                break;
            }
        }

        long result = 0;
        for (int i = 0; i < numbers.size(); i++) {

            result = (long) (result + numbers.get(i) * Math.pow(10, numbers.size() - 1 - i));
        }

        result = negative ? -result : result;

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) result;
        }
    }
}