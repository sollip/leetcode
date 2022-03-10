class Solution {
    public List<String> result = new ArrayList<>();

     public List<String> generateParenthesis(int n) {
        int left = n;
        int right = n;

        search(0, n - 1, n, "(");
        return result;
    }

    public void search(int index, int left, int right, String str) {
        if (left == 0 && right == 0) {
            result.add(str);
            return;
        }
        
        if (left != 0) {
            
            search(index + 1, left - 1, right, str + "(");
        }
        if (right <= left) {
            return;
        }
        if (right != 0) {
            search(index + 1, left, right - 1, str + ")");
        }
    }
}