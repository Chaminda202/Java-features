package interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("07865490"));
        System.out.println(isValidPhoneNumber("07jjjjj"));

        //Predicate
        System.out.println(isValidPhoneNumberPredicate.test("07123456"));
        System.out.println(isValidPhoneNumberPredicate.test("03123456"));

        System.out.println(isValidPhoneNumberPredicate.and(numberContains3).test("07123456"));
        System.out.println(isValidPhoneNumberPredicate.and(numberContains3).test("07120456"));
        System.out.println(isValidPhoneNumberPredicate.or(numberContains3).test("07120456"));
    }

    public static boolean isValidPhoneNumber(String phone){
        return phone.startsWith("07") && phone.length() == 8;
    }

    static Predicate<String> isValidPhoneNumberPredicate = phone -> phone.startsWith("07") && phone.length() == 8;

    static Predicate<String> numberContains3 = number -> number.contains("3");
}
