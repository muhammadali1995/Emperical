package InterviewPrep.Solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfThreeSums = new ArrayList<>();
        HashMap<Integer, Integer> mapOfInputs = new HashMap<>();
        HashMap<String, Integer> mapOfKeys = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mapOfInputs.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                Integer value = mapOfInputs.get(-(nums[i] + nums[j]));
                if (value==null) continue;
                int[] keys = new int[]{nums[i], nums[j], nums[value]};
                Arrays.sort(keys);
                String key = Arrays.toString(keys);
                if (value != i && value != j && mapOfKeys.get(key) == null) {
                    mapOfKeys.put(key, 1);
                    List<Integer> newLsut = new ArrayList<>();
                    newLsut.add(nums[i]);
                    newLsut.add(nums[j]);
                    newLsut.add(nums[value]);
                    listOfThreeSums.add(newLsut);
                }
            }
        }
        return listOfThreeSums;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> listOfThreeSums = new ArrayList<>();
        HashMap<String, Integer> mapOfKeys = new HashMap<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int[] keys = new int[]{nums[i], nums[k], nums[j]};
                    Arrays.sort(keys);
                    String key = Arrays.toString(keys);
                    if (mapOfKeys.get(key) == null) {
                        mapOfKeys.put(key, 1);
                        if (nums[i] + nums[k] + nums[j] == 0) {
                            ArrayList<Integer> listOfValues = new ArrayList<>();
                            listOfValues.add(nums[i]);
                            listOfValues.add(nums[k]);
                            listOfValues.add(nums[j]);
                            listOfThreeSums.add(listOfValues);
                        }
                    }
                }
            }
        }
        return listOfThreeSums;
    }
}
