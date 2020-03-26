package interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Customer customer = new Customer("Jhon", "123456", 25);
        greetCustomer(customer);

        //Consumer
        greetCustomerConsumer.accept(customer);
        greetCustomerConsumer.andThen(greetCustomerAgeConsumer).accept(customer);

        greetCustomerBi(customer, true);

        //BiConsumer
        greetCustomerBiConsumer.accept(customer, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.getName() + " your phone number is " + customer.getMobile());

    static Consumer<Customer> greetCustomerAgeConsumer = customer -> System.out.println("Hello " + customer.getName() + " your age is " + customer.getAge());


    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showNumber) -> System.out.println("Hello " + customer.getName() + " your phone number is " + (showNumber ? customer.getMobile(): "******"));

    public static void greetCustomer(final Customer customer) {
        System.out.println("Hello " + customer.getName() + " your phone number is " + customer.getMobile());
    }

    public static void greetCustomerBi(final Customer customer, final boolean showNumber) {
        System.out.println("Hello " + customer.getName() + " your phone number is " + (showNumber ? customer.getMobile(): "******"));
    }

    @Data
    @AllArgsConstructor
    static class Customer {
        private final String name;
        private final String mobile;
        private final int age;
    }
}
