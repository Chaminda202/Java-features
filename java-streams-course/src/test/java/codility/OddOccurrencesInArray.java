package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String args[]){
        System.out.println(oddOccurenceValue(new int[] {9, 3,9,3, 7}));
    }

    public static int oddOccurenceValue(int[] A){
        Map<Integer, Integer> checkOutList = new HashMap<>();

        Arrays.stream(A)
                .forEach(item -> {
                    if(checkOutList.containsKey(item)){
                        checkOutList.put(item, checkOutList.get(item) + 1);
                    }else{
                        checkOutList.put(item, 1);
                    }
                });
        return checkOutList.entrySet()
                .stream()
                .filter(entry -> 1 == entry.getValue())
                .findFirst()
                .get()
                .getKey();
    }
}
