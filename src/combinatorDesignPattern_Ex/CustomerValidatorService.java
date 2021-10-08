package combinatorDesignPattern_Ex;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isphoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears()>17;
    }

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail())
                && isphoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getDob());
    }

}