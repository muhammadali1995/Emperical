package Solutions.array;

public class FindTwoNonSubEachWithTargetSum {
    public int minSumOfLengths(int[] arr, int target) {

        int[] arr1 = new int[2];
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    count++;
                    if (count > 2) {
                        if (j - i < max) {
                            for (int k = 0; k < arr1.length; k++) {
                                if (arr1[k] == max) arr1[k] = j - i;
                                max = j - i;
                            }
                            for (int k = 0; k < arr1.length; k++) {
                                if (arr1[k] > max) max = arr1[k];
                            }
                        }
                        i = j;
                        break;
                    }
                    arr1[count - 1] = j - i;
                    if (j - i > max) max = j;
                } else if (sum > target) {
                    break;
                }

            }
        }
        if (count < 2) return -1;

        return arr1[1] + arr1[0] + 2;
    }
}