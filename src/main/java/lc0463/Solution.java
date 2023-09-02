package lc0463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) {
            return 0;
        }

        int cnt = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                cnt += celePerimeter(grid, row, col);
            }
        }


        return cnt;
    }

    protected int celePerimeter(int[][] grid, int row, int col) {
        switch (grid[row][col]) {
            case 0 -> {
                // 水域
                return 0;
            }
            case 1 -> {
                // land
                int cnt = 0;
                if (col - 1 < 0) {
                    cnt++;
                } else if (grid[row][col - 1] == 0) {
                    cnt++;
                }

                if (row - 1 < 0) {
                    cnt++;
                } else if (grid[row - 1][col] == 0) {
                    cnt++;
                }

                if (col + 1 >= grid[row].length) {
                    cnt++;
                } else if (grid[row][col + 1] == 0) {
                    cnt++;
                }

                if (row + 1 >= grid.length) {
                    cnt++;
                } else if (grid[row + 1][col] == 0) {
                    cnt++;
                }


                return cnt;
            }
        }
        return 0;
    }
}