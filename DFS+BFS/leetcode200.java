class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int[][] mark = new int[grid.length][grid[0].length];
        for(int[] c: mark) {
            Arrays.fill(c, 0);
        }
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && mark[i][j] == 0){
                    DFS(grid, i, j, mark);
                    count++;
                } 
            }
        }
        return count;
    }
    public void DFS(char[][] grid, int x, int y, int[][] mark){
        mark[x][y] = 1;
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, 1, -1, 0};
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length) {
                continue;
            }
            if (grid[newX][newY] == '1' && mark[newX][newY] == 0) {
                DFS(grid, newX, newY, mark);
            }
        }
    }
}

