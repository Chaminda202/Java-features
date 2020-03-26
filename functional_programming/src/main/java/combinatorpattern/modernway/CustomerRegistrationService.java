package combinatorpattern.modernway;

import combinatorpattern.Customer;
import combinatorpattern.oopway.CustomerValidator;

import java.time.LocalDate;

public class CustomerRegistrationService {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alex",
                "+01234567",
                "alex@gmail.com",
                LocalDate.of(1990, 9, 4));

        CustomerRegistrationValidator registrationValidator = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAgeRageValid());


        System.out.println("Checking first customer is valid " + registrationValidator.apply(customer).name());

        Customer secondCustomer = Customer.builder()
                .name("Maria")
                .email("mariagmail.com")
                .phoneNumber("12345")
                .dob(LocalDate.of(1999, 1, 1))
                .build();

        System.out.println("Checking second customer is valid " + registrationValidator.apply(secondCustomer).name());
    }
}
