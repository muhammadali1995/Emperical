package Solutions.recursion;

import java.util.HashMap;

public class ClimbingStairs {

    private HashMap<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if (n == 1 || n == 0 || n == 2) {
            return n;
        } else {
            return climb(n - 1) + climb(n - 2);
        }
    }

    public int  climb(int n){
        int result;
        if (cache.containsKey(n)){
            return  cache.get(n);
        } else if (n==1||n==0|| n==2){
            result = n;
        } else {
            result = climb(n-1) + climb(n-2);
        }
        cache.put(n, result);
        return  result;
    }
}
