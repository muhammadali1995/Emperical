package Solutions.array;

public class ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; ) {
            int nextMax = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                nextMax = Math.max(arr[j], nextMax);
            }

            while (arr[i] != nextMax && i < arr.length - 1) {
                arr[i] = nextMax;
                i++;
            }
            if (arr[i] != nextMax) i++;


        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
