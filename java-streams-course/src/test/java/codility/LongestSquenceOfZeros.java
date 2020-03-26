package codility;

import java.util.ArrayList;
import java.util.List;

public class LongestSquenceOfZeros {

    public static void main(String args[]){
        System.out.println(longestZero(9));
        //System.out.println(longestZero(1041));
    }

    public static int longestZero(int value){
        System.out.println("Entered value " + value);
        String binaryVal = Integer.toBinaryString(value);
        System.out.println("Binary value " + binaryVal);
        System.out.println("Binary value length " + binaryVal.length());

        if(binaryVal.contains("0")){
            List<Integer> oneList = new ArrayList<>();
            for (int i=0 ; i< binaryVal.length() ; i++){
                if(binaryVal.charAt(i) == '1')
                    oneList.add(i);
            }
            if(oneList.size() > 1) {
                List<Integer> diffList = new ArrayList<>();
                for (int i = 0; i < oneList.size() -1; i++) {
                    if (i != diffList.size() - 1) {
                        diffList.add(oneList.get(i + 1) - oneList.get(i));
                    }
                }
                if(diffList.size() > 1){
                    return (diffList.stream()
                            .mapToInt(v -> v)
                            .max()
                            .getAsInt() -1);
                }
                return diffList.get(0) -1;
            }
            return 0;
        }
        return 0;
    }

    public static int longestZeroWtRegex(int value) {
        System.out.println("Entered value " + value);
        String binaryVal = Integer.toBinaryString(value);
        System.out.println("Binary value " + binaryVal);
        String [] machingValues = binaryVal.split("([1][0]+[1])+");
        int maxLength = 0;
        if(machingValues.length > 1){
            for (int i = 0; i < machingValues.length - 1; i++) {
                if(maxLength < machingValues[i].length()) {
                    maxLength = machingValues[i].length();
                }
            }
            return  maxLength;
        }
        return machingValues.length == 1 ? machingValues[0].length() : 0;
    }
}
