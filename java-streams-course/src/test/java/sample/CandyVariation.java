package sample;
import java.util.*;

public class CandyVariation {
    public static void main(String[] args){
        System.out.println(solution(new int[] {3,4,7,7,6,6}));
        System.out.println(solution(new int[] {80,80,10000,80,80,80,80,80,80,1234567}));
    }

    public static int solution(int [] A){
        Set<Integer> variousCandies = new HashSet<>();
        int maxVariation = A.length /2;
        for(Integer val : A){
            if(!variousCandies.contains(val)){
                variousCandies.add(val);
            }
        }
        return (variousCandies.size() > maxVariation) ? maxVariation: variousCandies.size();
    }
}
