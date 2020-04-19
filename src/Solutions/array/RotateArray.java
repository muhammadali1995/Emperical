package Solutions.array;

public class RotateArray {

    int start;
    int result = 0;

    public int maxRotateFunction(int[] A) {
        start = A.length - 1;
        while (start >= 0) {
            int currentResult = 0;
            int currentStart = start;
            for (int i = 0; i < A.length; i++) {
                currentResult += A[currentStart] * i;
                currentStart++;
                if (currentStart==A.length){
                    currentStart = 0;
                }
            }
            if (start==A.length-1&&currentResult<0){
                result = currentResult;
            }else{
                if (currentResult > result) result = currentResult;
            }
            start--;
        }
        return result;
    }
}
