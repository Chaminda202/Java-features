package combinatorpattern.oopway;

import combinatorpattern.Customer;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {

    private boolean validEmail(String email){
        return email.contains("@");
    }

    private boolean validPhoneNumber(String number){
        return number.contains("+0");
    }

    private boolean validAgeRage(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() < 35;
    }

    public boolean isValidCustomer(Customer customer){
        return validEmail(customer.getEmail())
                && validPhoneNumber(customer.getPhoneNumber())
                && validAgeRage(customer.getDob());
    }
}
