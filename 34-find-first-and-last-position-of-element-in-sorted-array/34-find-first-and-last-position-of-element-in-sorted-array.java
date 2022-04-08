class Solution {
 public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for( int n : nums) {
            list.add(n);
        }
        return new int[] {list.indexOf(target), list.lastIndexOf(target)};
    }
}