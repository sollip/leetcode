class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();

        // 정렬
        Arrays.sort(nums);
        // a+b = -c c의 값을 지정
      for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int start = i + 1;
                int end = nums.length - 1;
                int temp = (-1) * nums[i];
                while (start < end) {
                    int sum = nums[start] + nums[end];
                    if (sum == temp) {
                        result.add(List.of(nums[i], nums[start], nums[end]));
                        start++;
                        end--;
                        while (nums[start] == nums[start - 1] && start < end) {
                            start++;
                        }
                        while (nums[end] == nums[end + 1] && start < end) {
                            end--;
                        }

                    } else if (sum > temp) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }

        }
        return result;
    }
   
}