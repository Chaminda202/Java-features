package sample;
import java.util.*;

public class LargestSeqGap {
    public static void main(String[] args){
        System.out.println(solution(new int[] {10, 0, 8, 2, 12, 11, 3}));
    }

    private static int solution(int[] A) {
        int max = 0;
        int distance = 0;
        Arrays.sort(A);
        for(int i=0;i< A.length -1; i++){
            distance = A[i+1] - A[i];
            if(Math.abs(distance) > max){
                max = Math.abs(distance);
            }
        }
        return max/2;
    }
}
