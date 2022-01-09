package main;

import java.util.Arrays;

/*
* You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.

You have two robots that can collect cherries for you:

Robot #1 is located at the top-left corner (0, 0), and
Robot #2 is located at the top-right corner (0, cols - 1).
Return the maximum number of cherries collection using both robots by following the rules below:

From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
When both robots stay in the same cell, only one takes the cherries.
Both robots cannot move outside the grid at any moment.
Both robots should reach the bottom row in grid.
*
* Example 1:


Input: grid = [[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
Output: 24
Explanation: Path of robot #1 and #2 are described in color green and blue respectively.
Cherries taken by Robot #1, (3 + 2 + 5 + 2) = 12.
Cherries taken by Robot #2, (1 + 5 + 5 + 1) = 12.
Total of cherries: 12 + 12 = 24.
* */

public class CherryPick2 {

    public int cherryPickup(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][][] dp = new int[row][col][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        dfs(0, 0, col - 1, dp, grid);
        return dp[0][0][col - 1];

    }

    static int dfs(int r, int c1, int c2, int[][][] dp, int[][] grid) {
        if (r >= grid.length || c1 < 0 || c1 >= grid[0].length || c2 < 0 || c2 >= grid[0].length)
            return 0;

        if (dp[r][c1][c2] != -1)
            return dp[r][c1][c2];

        int result = 0;
        if (r < grid.length) {
            result += grid[r][c1];
            if (c1 != c2)
                result += grid[r][c2];

            int max = 0;
            for (int i = c1 - 1; i <= c1 + 1; i++) {
                for (int j = c2 - 1; j <= c2 + 1; j++) {
                    max = Math.max(max, dfs(r + 1, i, j, dp, grid));
                }
            }
            result += max;
            dp[r][c1][c2] = result;
        }
        return result;
    }
}
