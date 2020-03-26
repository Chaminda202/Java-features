package optionals;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "Print default value");

        System.out.println(value);

        Object value1 = Optional.ofNullable(null)
                .orElse("Default value");

        System.out.println(value1);

        /*Object value3 = Optional.ofNullable(null)
                .orElseThrow((() -> new IllegalArgumentException("Exception")));

        System.out.println(value3);*/

        Optional.ofNullable("abc@gmail.com")
                .ifPresent(item -> {
                    System.out.println("Send message to " + item);
                });

        Optional.ofNullable("Hello Madam").ifPresent(System.out::println);

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        item -> {
                            System.out.println("Send message to " + item);
                        },
                        () -> {
                            System.out.println("Cannot be sent the mail");
                        });
    }
}
