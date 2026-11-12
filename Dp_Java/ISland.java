public class ISland {

    public static void dfs(char[][] grid, int r, int c) {

        int m = grid.length;
        int n = grid[0].length;

        if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }

    public static int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'1', '1', '0', '0'},
            {'1', '0', '0', '1'},
            {'0', '0', '1', '1'},
            {'0', '0', '0', '0'}
        };

        System.out.println("Number of Islands: " + numIslands(grid));
    }
}