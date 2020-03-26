package test;

import java.util.Arrays;

public class CheckedOutPut {
    public static void main(String[] args){
        //print(3);
        sort();
    }

    public static int print(int num){
        int sum=0;
        if(num ==0){
            return 0;
        }else{
            sum = 3 + print(num -1);
        }
        System.out.println(sum);
        return sum;
    }

    public static void temp(int num){
        int sum=0;
        if(num > 5){
            System.out.println("hiii");
        }else if (num >= 10 && num < 20){
            System.out.println("hoooo");
        }else if(num >= 20){
            System.out.println("heee");
        }
    }

    public static void sort(){
        int arr[] = { 2, 3, 4, 10, 40 };
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 2);
        System.out.println(index);
    }
}
