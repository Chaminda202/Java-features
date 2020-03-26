package callbacks;

import java.util.function.Consumer;

public class CallBackExample {
    public static void main(String[] args) {
        print("Grane", "Jhon", s -> System.out.println("No last name " +s));
        print("Grane", null, s -> System.out.println("No last name " +s));
        printSecond("Sam", "Kane", () -> System.out.println("No last name entered"));
        printSecond("Sam", null, () -> System.out.println("No last name entered"));
    }

    static void print(String firstName, String lastName, Consumer<String> callback){
        System.out.println("First name "+firstName);
        if(lastName != null){
            System.out.println("Last name " + lastName);
        }else{
            callback.accept(firstName);
        }
    }

    static void printSecond(String firstName, String lastName, Runnable runnable){
        System.out.println("First name "+firstName);
        if(lastName != null){
            System.out.println("Last name " + lastName);
        }else{
            runnable.run();
        }
    }
}
