package ToptalPrep;

public class SrufaceAreaOf3dShapes {
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int currSize = grid[i][j];
                if (currSize > 0) sum += 2;
                if (i == 0) sum += currSize;
                if (i == grid.length - 1) sum += currSize;
                if (j == grid[i].length - 1) sum += currSize;
                if (j == 0) sum += currSize;
                if (i < grid.length - 1 && currSize > grid[i + 1][j]) sum += (currSize - grid[i + 1][j]);
                if (j < grid[i].length - 1 && currSize > grid[i][j + 1]) sum += (currSize - grid[i][j + 1]);
                if (i > 0 && grid[i - 1][j] < currSize) sum += (currSize - grid[i - 1][j]);
                if (j > 0 && grid[i][j - 1] < currSize) sum += (currSize - grid[i][j - 1]);
            }
        }
        return sum;
    }
}
