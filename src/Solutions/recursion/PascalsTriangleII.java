package Solutions.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    int[][] values;

    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        values = new int[rowIndex+1][rowIndex+1];
        List<Integer> listOfValues = new ArrayList<>();

        for (int i = 1; i <= rowIndex; i++) {
//            listOfValues.add(fill(rowIndex, i));
            System.out.println(fill(rowIndex, i));
        }

        return listOfValues;
    }

    public int fill(int row, int column) {
        if (row == column || column == 1) {
            return 1;
        }
        if (values[row][column] > 0) {
            return values[row][column];
        }
        values[row-1][column-1] = fill(row - 1, column - 1);
        values[row-1][column] = fill(row - 1, column);
        return values[row - 1][column - 1] + values[row - 1][column];
    }
}
