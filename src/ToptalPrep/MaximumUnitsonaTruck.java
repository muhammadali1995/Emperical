package ToptalPrep;

import java.util.*;

public class MaximumUnitsonaTruck {
    public static void main(String[] args) {
        MaximumUnitsonaTruck max = new MaximumUnitsonaTruck();
        System.out.println(max.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt(a -> a[1]));
        int max = 0;
        int currSize = 0;
        for (int j = boxTypes.length - 1; j >= 0; j--) {
            int[] box = boxTypes[j];
            int unit = box[1];
            int size = box[0];
            if (currSize + size <= truckSize) {
                max += unit * size;
                currSize += size;
            } else {
                max += unit * (truckSize - currSize);
                return max;
            }
        }


        return max;


    }
}
