package combinatorpattern.modernway;

import combinatorpattern.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.modernway.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {
    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? SUCCESS :
                EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().contains("+0") ? SUCCESS :
                PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAgeRageValid(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() < 35 ? SUCCESS :
                IS_NOT_IN_VALID_AGE_RAGE;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result == SUCCESS ? other.apply(customer) : result;
        };
    }
}
