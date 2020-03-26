package sample;

import java.util.HashMap;
import java.util.Map;

public class BinaryGap {
    public static void main(String[] args){
        char[] chars = String.valueOf(1234).toCharArray();

        //System.out.println(solution(15));
        System.out.println(Integer.toBinaryString(115));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.toBinaryString(115 & 15));
        Map<String, String> test = new HashMap<>();
        test.put("A", "abc");
        test.put("B", "def");
        System.out.println(test.put("A", "ghi"));

        System.out.println(test.get("A"));
        System.out.println(test.get(null));
    }

    public static int solution(int n){
        String binary = Integer.toBinaryString(n);
        String[] gaps = binary.split("1");
        String maxGaps = "";
        int gapsCount = binary.endsWith("1") ? gaps.length : gaps.length -1;

        for(int i=0 ; i< gapsCount; i++){
            if(gaps[i].length() > maxGaps.length())
                maxGaps = gaps[i];
        }
        return maxGaps.length();
    }
}
