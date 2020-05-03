package InterviewPrep.Solutions;

public class MaximumPointsYouCanObtainCards {
        public int maxScore(int[] cardPoints, int k) {
            int left = 0;
            int right = cardPoints.length - 1;
            int maxSum = 0;
            for (int i = 0; i < k; i++) {
                if (cardPoints[right] > cardPoints[left]) {
                    maxSum += cardPoints[right];
                    right--;
                } else if (cardPoints[right] < cardPoints[left]) {
                    maxSum += cardPoints[left];
                    left++;
                } else {
                    if (nextMax(left, right,cardPoints)){
                        maxSum += cardPoints[left];
                        left++;
                    }else {
                        maxSum += cardPoints[right];
                        right--;
                    }
                }
            }
            return maxSum;
        }


        private boolean nextMax(int left, int right, int[] cardPoints) {
            while (left < right) {
                if (cardPoints[left] > cardPoints[right]) {
                    return true;
                } else if (cardPoints[right] > cardPoints[left]) {
                    return false;
                } else {
                    right--;
                    left++;
                }
            }
            return true;
        }
}
