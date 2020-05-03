package InterviewPrep.Solutions;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int min = 1;
        int max = n;
        while (min <= max) {
            int mid = min +  (max-min) >> 2;
            if (isBadVersion(mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }


    public boolean isBadVersion(int mid) {
        return true;
    }
}
