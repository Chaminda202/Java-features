package sample;

import java.util.*;

public class MinDistance {
    public static void main(String[] args){
        System.out.println(solution(new int[] {8,24,3,20,1,17}));
        System.out.println(solution(new int[] {7,21,3,42,3,7}));
        Set<Integer> val = new HashSet<>();
    }

    public static int solution(int [] A){
        Arrays.sort(A);
        int minVal = A[1] - A[0];
        for(int i=0; i< A.length -1 ;i++){
            if((A[i+1] - A[i]) <= minVal){
                minVal = A[i+1] - A[i];
            }
        }
        return minVal;
    }
}
