package ToptalPrep;

public class MinimumMovesEqualArrayElements {

    public static void main(String[] args) {
        MinimumMovesEqualArrayElements arrayElements = new MinimumMovesEqualArrayElements();
        System.out.println(arrayElements.minMoves(new int[]{1, 2, 3, 5}));
    }

    public int minMoves(int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];
        for (int n : nums) min = Math.min(min, n);
        int res = 0;
        for (int n : nums) res += n - min;
        return res;
    }
}


// 1,2,3,5  // 11 //14//17//20//