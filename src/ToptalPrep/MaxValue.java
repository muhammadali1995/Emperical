package ToptalPrep;

import java.util.*;

public class MaxValue {
    public static void main(String[] args) {

        MaxValue mx = new MaxValue();
        int a[] = new int[]{1, 2};
        int b[] = new int[]{3, 4};
        int nums[][] = new int[][]{a, b};
        System.out.println(Arrays.deepToString(mx.matrixReshape(nums, 1, 4)));
        ArrayList list = new ArrayList();;


    }


    public int maximumGain(String s, int x, int y) {
        int max = 0;
        int i = 0;

        int x1 = Math.max(x, y);
        int y1 = Math.min(x, y);
        char a, b, c, d;


        if (x > y) {
            a = 'a';
            b = 'b';
            d = 'b';
            c = 'a';
        } else {
            a = 'b';
            b = 'a';
            d = 'a';
            c = 'b';
        }


        char[] letters = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char l : letters) {
            if (!stack.empty() && stack.peek() == a && l == b) {
                stack.pop();
                max += x1;
            } else {
                stack.push(l);
            }
        }


        while (!stack.empty()) {
            char n = stack.pop();
            if (!stack.empty() && (n == c && stack.peek() == d)) {
                max += y1;
                stack.pop();
            }
        }

        return max;
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] ansMatrix = new int[r][c];
        int row = 0;
        int column = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                ansMatrix[row][column++] = nums[i][j];
                if (column == c) {
                    column = 0;
                    row++;
                }
            }
        }

        return ansMatrix;
    }
}
