import java.util.*;

public class Points {
    public int solution(String S, int[] X, int[] Y) {
        char[] chars = S.toCharArray();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            points.add(new Point(X[i], Y[i], chars[i]));
        }
        Collections.sort(points, Comparator.comparingDouble(Point::distance));

        HashMap<Character, Point> set = new HashMap<>();
        for (Point point : points) {
            Point p = set.get(point.label);
            if(p != null) {
                if(p.distance() == point.distance()) {
                    return set.size() - 1;
                }
                return set.size();
            }

            set.put(point.label, point);
        }
        return points.size();
    }
}

class Point {
    int x;
    int y;
    char label;

    public Point(int x, int y, char label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }
    double distance() {
        return Math.sqrt(x * x + y * y);
    }

}