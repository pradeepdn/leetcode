class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowCol = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            rowCol.clear();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.' && !rowCol.add(board[i][j])) {
                    return false;
                }
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            rowCol.clear();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.' && !rowCol.add(board[j][i])) {
                    return false;
                }
            }
        }
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                rowCol.clear();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(board[boxRow + i][boxCol + j] != '.' && !rowCol.add(board[boxRow + i][boxCol + j])){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}