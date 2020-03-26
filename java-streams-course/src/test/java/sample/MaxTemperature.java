package sample;

import java.util.Arrays;

public class MaxTemperature {
    public static void main(String[] args){
        System.out.println(solution(new int[] {8,24,3,20,1,17, -23, 34}));
        System.out.println(solution(new int[] {8,24,3,5,-9,5,3,20,1,17, -2, 3}));
    }

    private static String solution(int [] A){
        int temCount = A.length /4;
        int [] win = Arrays.copyOfRange(A, 0, temCount);
        int [] aut = Arrays.copyOfRange(A, temCount, temCount*2);
        int [] spr = Arrays.copyOfRange(A, temCount*2, temCount*3);
        int [] sum = Arrays.copyOfRange(A, temCount*3, A.length);

        int [] temDiff = new int[4];

        Arrays.sort(win);
        Arrays.sort(aut);
        Arrays.sort(spr);
        Arrays.sort(sum);

        temDiff[0]= win[temCount-1] - win[0];
        temDiff[1]= aut[temCount-1] - aut[0];
        temDiff[2]= spr[temCount-1] - spr[0];
        temDiff[3]= sum[temCount-1] - sum[0];

        int maxTemp = temDiff[0];
        int season = 0;
        for(int i=0; i< 4; i++){
            if(maxTemp < temDiff[i]){
                maxTemp = temDiff[i];
                season = i;
            }
        }
        return seasonWithTemperature(season, maxTemp);
    }

    private static String seasonWithTemperature(int index, int temp){
        switch(index){
            case 0:
                return "WINTER temperature "+temp;
            case 1:
                return "AUTUMN temperature "+temp;
            case 2:
                return "SPRING temperature "+temp;
            case 3:
                return "SUMMER temperature "+temp;
            default:
                return null;
        }
    }
}
