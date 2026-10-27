class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char ch = board[i][j];
                if (ch == '.') {
                    continue;
                }
                if (rows.contains(ch)) {
                    return false;
                }
                rows.add(ch);
            }
            rows = new HashSet<>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char ch = board[j][i];
                if (ch == '.') {
                    continue;
                }
                if (rows.contains(ch)) {
                    return false;
                }
                rows.add(ch);
            }
            rows = new HashSet<>();
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                HashSet<Character> seen = new HashSet<>();

                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {

                        char ch = board[r][c];

                        if (ch == '.') continue;

                        if (seen.contains(ch)) {
                            return false;
                        }

                        seen.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
