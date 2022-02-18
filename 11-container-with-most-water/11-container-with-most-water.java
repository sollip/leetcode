class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length-1;
        int minHeight = 0;
        int area = 0;

        while (start!=end) {
            minHeight = Math.min(height[start], height[end]);
            area = (end - start) * minHeight;
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
            max = Math.max(area, max);
        }

        //        for (int i = 0; i < height.length - 1; i++) {
        //            for (int j = 0; j < height.length; j++) {
        //                temp = (j - i) * Math.min(height[i], height[j]);
        //                max = Math.max(max, temp);
        //            }
        //        }
        
        return max;
    }
}