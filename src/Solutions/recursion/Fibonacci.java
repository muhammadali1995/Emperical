package Solutions.recursion;

import java.util.HashMap;

public class Fibonacci {
    public int findFibonacciOfN(int n) {
        if (n == 1) { return 1; } else if (n == 0) { return 0; }
        return findFibonacciOfN(n - 1) + findFibonacciOfN(n - 2);
    }

        HashMap<Integer, Integer> cache = new HashMap<>();
        public int  fib(int n){
                int result;
                 if (cache.containsKey(n)){
                       return  cache.get(n);
                 } else if (n==1||n==0){
                     result = n;
                 } else {
                     result = fib(n-1) + fib(n-2);
                 }
                 cache.put(n, result);
                 return  result;
        }
}
