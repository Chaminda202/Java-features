package combinatorpattern.oopway;

import combinatorpattern.Customer;

import java.time.LocalDate;

public class CustomerService {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alex",
                "+01234567",
                "alex@gmail.com",
                LocalDate.of(1990, 9, 4));

        System.out.println("Checking first customer is valid " + new CustomerValidator().isValidCustomer(customer));

        Customer secondCustomer = Customer.builder()
                .name("Maria")
                .email("mariagmail.com")
                .phoneNumber("12345")
                .dob(LocalDate.of(1999, 1, 1))
                .build();

        System.out.println("Checking second customer is valid " + new CustomerValidator().isValidCustomer(secondCustomer));
    }
}
