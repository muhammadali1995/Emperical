package InterviewPrep.Solutions;


import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidsLeft = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroidsLeft.size() == 0) {
                asteroidsLeft.push(asteroids[i]);
            } else if (asteroids[i] < 0 && asteroidsLeft.peek() > 0) {
                while (asteroidsLeft.size() > 0 && asteroidsLeft.peek() < Math.abs(asteroids[i]) && asteroidsLeft.peek() > 0) {
                    asteroidsLeft.pop();
                }
                if (asteroidsLeft.size() > 0 && asteroidsLeft.peek() == Math.abs(asteroids[i])) {
                    asteroidsLeft.pop();
                } else if (asteroidsLeft.size() == 0 || asteroids[i] == asteroidsLeft.peek() || (asteroids[i] < 0 && asteroidsLeft.peek() < 0)) {
                    asteroidsLeft.push(asteroids[i]);
                }
            } else {
                asteroidsLeft.push(asteroids[i]);
            }
        }

        int[] asteroidsLeftEnd = new int[asteroidsLeft.size()];
        int i = asteroidsLeft.size() - 1;
        while (asteroidsLeft.size() > 0) {
            asteroidsLeftEnd[i] = asteroidsLeft.pop();
            i--;
        }
        return asteroidsLeftEnd;
    }
}
