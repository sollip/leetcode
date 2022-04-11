

class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String result = "1";
        for (int i = 0; i < n-1; i++) {
            result = cas(result);
        }
        return result;
    }

    public String cas(String str) {
        char[] nums = str.toCharArray();
        int prevNum = nums.length > 1 ? nums[0] - '0' : -1;
        String result = "";

        if (nums.length == 1) {
            return "1" + (nums[0] - '0');
        }

        int count = 1;
        int targetNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                targetNum = nums[i] - '0';
            } else if (i == nums.length - 1) {
                if (nums[i] - '0' != targetNum) {
                    result = result + count + targetNum + "1" + (nums[i] - '0');
                } else {
                    count++;
                    result = result + count + targetNum;
                }
            } else {
                if (nums[i] - '0' != targetNum) {
                    result = result + count + targetNum;
                    targetNum = nums[i] - '0';
                    count = 1;
                } else {
                    count++;
                }
            }
        }
        return result ;
    }
}