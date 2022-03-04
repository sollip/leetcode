class Solution {
   public String[] dials = {"", "", "abc", "def", "ghi", "kjl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() > 0) {
            dfs(0, digits.toCharArray(), new StringBuilder());
        }
        return result;
    }

    public void dfs(int depth, char[] digits, StringBuilder sb) {
        if (depth == digits.length) {
            result.add(sb.toString());
            return;
        }

        int digit = digits[depth] - '0';
        char[] letters = dials[digit].toCharArray();
        System.out.println(digits[depth]);
        for (int i = 0; i < letters.length; i++) {
            sb.append(letters[i]);
            dfs(depth + 1, digits, sb);
            sb.delete(sb.length() - 1, sb.length()); // dfs에서 넣어준거 다뺌
        }
    }
}