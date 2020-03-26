package com.example.demo.test;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String [] args){
       //System.out.println(gcd(3000, 4500));
        int[] array = {2, 5, 6, 7, 19, 30, 45, 40, 38, 78,20, 15, 12, 5, 3, 89};
        //System.out.println(maxNumber(array, 0, array.length, array.length));
    }

    private static int gcd(int a, int b) {
        if(b==0) {
            return 0;
        }
        int remainder = a % b;
        if(remainder == 0) {
            return b;
        }else {
            return gcd(b, remainder);
        }
    }

    private static int maxNumber(int[] array, int start, int end, int length) {
        int middle = start + (end - start) / 2;
        if (array[middle] > array[middle - 1] && array[middle] > array[middle + 1]) {
            return array[middle];
        }else if (array[middle] > array[middle - 1] && array[middle] < array[middle + 1]) {
            return maxNumber(array, middle, length, length);
        }else {
            return maxNumber(array, start, middle, length);
        }
    }
}
