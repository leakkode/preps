package Concept.Algorithm.Recursion.Backtracking;

public class MaxAreaofIsland {

    public int R(int[][] grid, int i, int j, int[][] visited) {
        if (visited[i][j]!=0) return 0;
        // base:
        if (grid[i][j]==0) {
            return 0;
        }

        System.out.format("i: %d, j: %d\n", i, j);
        visited[i][j] = 1;

        int N = i+1<grid.length? R(grid, i+1, j, visited) : 0;
        int S = i-1>=0? R(grid, i-1, j, visited) : 0;
        int E = j+1<grid[i].length? R(grid, i, j+1, visited) : 0;
        int W = j-1>=0? R(grid, i, j-1, visited) : 0;

        return 1 + Math.max(Math.max(N,S), Math.max(W,E));
    }

    public int go(int[][] grid) {
        int max = 0;
        for (int r=0; r<grid.length; r++) {
            for (int c=0; c<grid[r].length; c++) {
                int[][] visited = new int[grid.length][grid[r].length];

                int count = R(grid, r, c, visited);
                System.out.println(count);
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
