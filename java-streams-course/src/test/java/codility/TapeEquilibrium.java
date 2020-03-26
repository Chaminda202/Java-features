package codility;

import java.util.Arrays;

public class TapeEquilibrium {
    public static void main(String args[]){
        System.out.println(minimumGap(new int [] {3, 1, 2,4, 3}));
    }



    public static int minimumGap(int [] arr){
        final int sum = Arrays.stream(arr)
                .sum();
        int [] range = new int[arr.length-1];

        for(int i=0; i< arr.length -1 ;i++){
            int j= i;
            int firstVal = 0;
            while(j >=0){
                firstVal +=arr[j];
                j--;
            }
            int seconVal = (sum -firstVal) - firstVal;
            range[i]=Math.abs(seconVal);
        }
        Arrays.stream(range).forEach(System.out::println);
        return Arrays.stream(range).min().getAsInt();
    }
}
