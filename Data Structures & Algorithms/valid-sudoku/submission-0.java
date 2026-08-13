class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> filas = new ArrayList<>();
        List<HashSet<Character>> columnas = new ArrayList<>();
        List<HashSet<Character>> boxes = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            filas.add(new HashSet<>());
            columnas.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int boxIndex = i / 3 * 3 + j / 3;
                    if (!filas.get(i).add(board[i][j]) || !columnas.get(j).add(board[i][j]) || !boxes.get(boxIndex).add(board[i][j])) {
                        return false;
                    }

                } else
                    continue;
            }
        }
        return true;
    }
}
