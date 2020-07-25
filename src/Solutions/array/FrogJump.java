package Solutions.array;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        int difference = Y - X;
        if (difference <= 0) return 0;
        else {
            int remainder = difference % D;
            int result = difference / D;
            return remainder == 0 ? result : result + 1;
        }
    }
}
