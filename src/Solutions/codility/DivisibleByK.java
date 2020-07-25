package Solutions.codility;

public class DivisibleByK {
    public int solution(int A, int B, int K) {
        if (B==0&& K!=0) return 1;
        if (K==0) return 0;
        int count = B / K - A / K;
        if (A%K==0) count++;

        return count;
    }
}
