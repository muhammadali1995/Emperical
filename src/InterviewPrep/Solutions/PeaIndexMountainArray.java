package InterviewPrep.Solutions;

public class PeaIndexMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int peakIndex = 0;
        for (int i = 0; i <A.length ; i++) {
            if (A[peakIndex]<A[i]) {
                peakIndex = i;
            }
        }
        return peakIndex;
    }
}
