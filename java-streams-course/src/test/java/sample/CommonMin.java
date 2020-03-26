package sample;
import com.sun.deploy.util.OrderedHashSet;

import java.util.*;

public class CommonMin {
    public static void main(String[] args){
        System.out.println(solution1(new int[] {1,3,2,1}, new int[] {4,2,5,32,1}));
    }

    public static int solution(int [] A, int [] B){
        Set<Integer> maching = new HashSet<>();
        for(int i=0; i< A.length; i++){
            int j=0;
            while(j < B.length){
                if(A[i] == B[j]){
                    if(!maching.contains(A[i]))
                        maching.add(A[i]);
                }
                j++;
            }
        }
        return maching.stream().min(Comparator.naturalOrder())
                .get();
    }

    private static int solution1(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        for (int k = 0; k < A.length; k++) {
            if (i < m - 1 && B[i] < A[k]) {
                while (i < m - 1 && B[i] < A[k]) {
                    i += 1;
                }
            }
            if (A[k] == B[i]) {
                return A[k];
            }
        }

        return -1;
    }
}
