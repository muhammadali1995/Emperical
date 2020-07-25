package Solutions.codility;

public class Intersection {
    public int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int a1 = i - A[i];
            int a2 = i + A[i];
            for (int j = i + 1; j < A.length; j++) {
                int b1 = j - A[j];
                int b2 = j + A[j];
                if ((a1 >= b1 && a2 <= b2) || (b1 >= a1 && a2 <= b2)) {
                    count++;
                    if(count > 10000000) return -1;
                }
            }
        }
        return count;
    }
}
