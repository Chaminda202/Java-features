package sample;


import java.util.Arrays;

public class ArrageLargestNumber {
    public static void main(String[] args){
        System.out.println(solution(955));
    }

    public static int solution(int n){
        char [] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        String val = new String(arr);
        StringBuilder builder = new StringBuilder(val);
        return Integer.parseInt(builder.reverse().toString());
    }
}
