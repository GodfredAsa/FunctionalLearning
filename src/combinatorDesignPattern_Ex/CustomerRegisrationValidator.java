package combinatorDesignPattern_Ex;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;


// ***************  COMBINATOR DESIGN PATTERN **********************


import static combinatorDesignPattern_Ex.CustomerRegisrationValidator.*;
import static combinatorDesignPattern_Ex.CustomerRegisrationValidator.ValidationResult.EMAIL_NOT_VALID;
import static combinatorDesignPattern_Ex.CustomerRegisrationValidator.ValidationResult.SUCCESS;
import static combinatorDesignPattern_Ex.CustomerRegisrationValidator.ValidationResult.PHONE_NUMBER_NOT_VALID;
import static combinatorDesignPattern_Ex.CustomerRegisrationValidator.ValidationResult.IS_NOT_AN_ADULT;

public interface CustomerRegisrationValidator extends Function<Customer, ValidationResult> {

    static  CustomerRegisrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS: EMAIL_NOT_VALID;
    }

    static  CustomerRegisrationValidator isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("+0") ?
                ValidationResult.SUCCESS: PHONE_NUMBER_NOT_VALID;
    }

    static  CustomerRegisrationValidator isAnAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>17 ?
                ValidationResult.SUCCESS: IS_NOT_AN_ADULT;
    }


    default CustomerRegisrationValidator and (CustomerRegisrationValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };

    }

    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }


}
