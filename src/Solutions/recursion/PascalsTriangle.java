package Solutions.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalList = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                list.add(fill(i, j));
            }
            pascalList.add(list);
        }
        return pascalList;
    }

     private int  fill(int row, int column){
         if (row == column || column == 1) {
             return 1;
         }
         return fill(row-1, column - 1) + fill(row-1, column);
    }
}
