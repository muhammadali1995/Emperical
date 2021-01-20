package ToptalPrep;

import java.util.*;

public class SortByBitCount {
        public int[] sortByBits(int[] arr) {

            TreeSet<Integer> setOfKeys = new TreeSet<>();

            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i : arr) {
                int count = Integer.bitCount(i);
                ArrayList<Integer> list = map.getOrDefault(count, new ArrayList<>());
                list.add(i);
                setOfKeys.add(count);
                map.put(count, list);
            }
            int i = 0;
            for (int key : setOfKeys) {
                for (int j : map.get(key)) {
                    arr[i++] = j;
                }
            }

            return arr;
        }
}


class CustomComporator implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[1] - o2[1];
    }
}