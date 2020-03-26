package codility;

import java.util.Arrays;
import java.util.HashSet;

public class MissingElement {
    public static void main(String args[]){
        System.out.println(element(new int[] {1,2,4,5}));
    }

    /*public static int element(int [] elements){
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(elements)
                .summaryStatistics();
        int minVal = intSummaryStatistics.getMin();
        int maxVal = intSummaryStatistics.getMax();
        int sum = (int) intSummaryStatistics.getSum();
        int actualTotal = 0;
        for(int i = minVal; i <= maxVal; i++){
            actualTotal+=i;
        }
        return actualTotal - sum;
    }*/
    public static int element(int [] elements){
        int sum = 0;
        int actualTotal = 0;
        for(int i = 0; i < elements.length; i++){
            sum+=elements[i];
        }
        for(int i = 1; i <= elements.length + 1 ; i++){
            actualTotal+=i;
        }
        return actualTotal - sum;
    }
}
