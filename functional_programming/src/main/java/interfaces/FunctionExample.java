package interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(incrementByOne(a));

        //Function
        System.out.println(incrementByOne.apply(a));
        System.out.println(multiplyByTen.apply(a));

        final Function<Integer, Integer> incrementBy1AndTenMultiplyBy10 = incrementByOne.andThen(multiplyByTen);
        System.out.println(incrementBy1AndTenMultiplyBy10.apply(a));

        //BiFunction
        System.out.println(incrementByOneAndMultiply(2, 3));
        System.out.println(incrementByOneAndMultiply.apply(2, 3));
    }

    public static int incrementByOne(int number){
        return ++number;
    }
    
    static Function<Integer, Integer> incrementByOne = number -> ++number;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    public static int incrementByOneAndMultiply(int number, int multiplyNumber){
        return (number + 1) * multiplyNumber;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = (number, multiplyNumber) -> ++number * multiplyNumber;
}
