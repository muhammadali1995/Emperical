package ToptalPrep;

import java.util.HashSet;

public class GetDifferentNumber {

    static int getDifferentNumber(int[] arr) {
        // your code goes here

        if (arr.length==1) {
            if (arr[0]>0) return 0;
            else {
                return arr[0]+1;
            }
        }

        HashSet<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }

        for(int i=min; i<=max; i++){
            if(!set.contains(i)) return i;
        }

        return max+1;
    }


    public static void main(String[] args) {
        System.out.println(getDifferentNumber(new int[]{10}));
    }

}
