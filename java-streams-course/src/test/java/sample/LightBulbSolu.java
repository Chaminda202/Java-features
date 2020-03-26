package sample;

public class LightBulbSolu {
    public static void main(String[] args){
        System.out.println(solution(new int[] {2,1,3,5,4}));
    }

    private static int solution(int[] A) {
        int turn = 0;
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
            if (max == i + 1)
                turn += 1;
        }
        return turn;
    }
}
