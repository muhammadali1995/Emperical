package Solutions.recursion;

public class Fibonacci {
    public int findFibonacciOfN(int n) {
        if (n == 1) { return 1; } else if (n == 0) { return 0; }
        return findFibonacciOfN(n - 1) + findFibonacciOfN(n - 2);
    }
}
