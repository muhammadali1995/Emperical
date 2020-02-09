package Solutions.recursion;

import Solutions.ReverseBits;

public class Test {
    public static void main(String[] args) {
        PascalsTriangleII pascalsTriangle = new PascalsTriangleII();
        pascalsTriangle.getRow(3);
    }
    private static void printReverse(char[] str) {
        helper(0, str);
    }

    private static void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
