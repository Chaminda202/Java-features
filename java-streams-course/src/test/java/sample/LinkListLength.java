package sample;

public class LinkListLength {
    public static void main(String[] args){
        System.out.println(solution(new int[] {1,4,-1,3,2}));
    }

    private static int solution(int[] A) {
        int length = 1;
        int next = A[0];
        while (next != -1) {
            next = A[next];
            length += 1;
        }
        return length;
    }
}
