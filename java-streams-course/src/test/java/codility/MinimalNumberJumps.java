package codility;

public class MinimalNumberJumps {
    public static void main(String args[]){
        System.out.println(countOfJumps(10, 85, 30));
    }
    public static int countOfJumps(int x, int y, int d){
        int diff = y - x;
        int remain = 0;
        int count = 0;
        count = diff /d;
        remain = diff - (count * d);
        if(remain != 0){
            count+= 1;
        }
        return count;
    }
}
