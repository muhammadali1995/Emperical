package InterviewPrep.Solutions;

import java.util.Arrays;

public class ProductfArrayExceptSelf {

    public int [] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int[] temp = new int[nums.length];
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) product *=nums[j];
                temp[j] = product;
            }
            System.out.println(Arrays.toString(temp));
            output[i] = product;
        }
        return output;
    }

    public int[] productExceptSelfWithDivision(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                product *= nums[i];
            else
                zeroCount++;

            System.out.println(product);

        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 1) {
                if (nums[i] == 0) nums[i] = product;
                else nums[i] = 0;
            } else if (zeroCount > 1) {
                nums[i] = 0;
            } else {
                nums[i] = product / nums[i];
            }
        }

        return nums;
    }
}
