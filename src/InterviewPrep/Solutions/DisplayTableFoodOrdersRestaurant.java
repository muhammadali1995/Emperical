package InterviewPrep.Solutions;

import java.util.*;

public class DisplayTableFoodOrdersRestaurant {
    public List<List<String>> displayTable(List<List<String>> orders) {
        HashMap<Integer, HashMap<String, Integer>> sortedOrders = new HashMap<>();
        ArrayList<String> existingFoodName = new ArrayList<>();
        ArrayList<Integer> keyss = new ArrayList<>();
        for (List<String> order : orders) {
            int tableN = Integer.parseInt(order.get(1));
            String foodN = order.get(2);
            if (!existingFoodName.contains(foodN)) existingFoodName.add(foodN);
            if (!keyss.contains(tableN)) keyss.add(tableN);
            HashMap<String, Integer> foodMap = new HashMap<>();
            if (sortedOrders.containsKey(tableN)) {
                foodMap = sortedOrders.get(tableN);
                int count = 0;
                if (foodMap.containsKey(foodN)){
                    count = foodMap.get(foodN);
                }
                foodMap.put(foodN, ++count);
            }else {
                foodMap.put(foodN, 1);
                sortedOrders.put(tableN, foodMap);
            }
        }

        List<List<String>> allOrderSorted = new ArrayList<>();
        ArrayList<String> foodNames = new ArrayList<>();
        foodNames.add("Table");
        Collections.sort(existingFoodName);
        foodNames.addAll(existingFoodName);
        allOrderSorted.add(foodNames);
        Collections.sort(keyss);
        for (int key: keyss) {
            ArrayList<String> newRow = new ArrayList<>();
            for (int i = 0; i <foodNames.size()-1 ; i++) {
                newRow.add("0");
            }
            newRow.add(0, ""+key);
            for (String foodN: sortedOrders.get(key).keySet()) {
                HashMap<String, Integer> map = sortedOrders.get(key);
                newRow.set(foodNames.indexOf(foodN), "" + map.get(foodN));
            }
            allOrderSorted.add(newRow);
        }
        return allOrderSorted;
    }
}
