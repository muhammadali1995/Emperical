package InterviewPrep.Solutions;

public class ContainerWithMostWater {


    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while (i <= j) {
            int result = Math.min(height[i], height[j]) * (j - i);
            if (result > maxArea) maxArea = result;
            if (i<j){
                i++;
            }else {
                j--;
            }
        }
        return maxArea;
    }


    public int maxArea2(int[] height) {
        int maxHeight = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int result = (j - i) * Math.min(height[i], height[j]);
                if (result > maxHeight) {
                    maxHeight = result;
                }
            }
        }
        return maxHeight;
    }
}
