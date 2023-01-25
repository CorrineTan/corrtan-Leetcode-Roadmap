class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == (m - 1) || j == (n - 1)){ 
                    DFS(board, i, j);
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } 
                if (board[i][j] == 'N') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    public void DFS(char[][] board, int x, int y) {
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] == 'X' || board[x][y] == 'N'){
            return;
        } 
        board[x][y] = 'N';
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            DFS(board, newX, newY);
        }
    }
}

