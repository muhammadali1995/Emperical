package Solutions.codility;

public class PassingCars {
    public int solution(int[] A) {
        int countOfOne = 0;
        int countOfPassingCars = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) countOfOne++;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                countOfOne--;
            } else {
                countOfPassingCars += countOfOne;
            }
        }
        return countOfPassingCars;
    }
}
