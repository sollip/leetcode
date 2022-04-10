class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowChecker = new boolean[10][10];
        boolean[][] columnChecker = new boolean[10][10];
        boolean[][] subChecker = new boolean[10][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char target = board[i][j];
                if (target == '.') {

                    continue;
                }
                int targetNum = target - '0';
                int subIndex =(i / 3 * 3) + j / 3;
                if (rowChecker[i][targetNum]) {
                    return false;
                }
                if (columnChecker[j][targetNum]) {
                    return false;
                }
                if (subChecker[subIndex][targetNum]) {
                    return false;
                }
                rowChecker[i][targetNum] = true;
                columnChecker[j][targetNum] = true;
                subChecker[subIndex][targetNum] = true;
            }
        }
        return true;
    }
}