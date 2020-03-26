package codility;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String args[]){
        Arrays.stream(cycle(new int[] {9, 3,9,3, 7}, 2)).forEach(System.out::println);
    }

    public static int [] cycle(int[] A, int k){
        int [] rotatedOne = new int[A.length];

        for(int i=0 ;i< A.length; i++){
            int j = (i+k)%A.length;
            rotatedOne[j] =  A[i];
        }
        return rotatedOne;
    }
}
