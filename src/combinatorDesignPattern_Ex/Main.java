package combinatorDesignPattern_Ex;

import java.time.LocalDate;

import static combinatorDesignPattern_Ex.CustomerRegisrationValidator.*;
import static combinatorDesignPattern_Ex.CustomerRegisrationValidator.isPhoneNumberValid;

public class Main {
    public static void main(String[] args) {
        Customer customer  = new Customer(
                "Alice", "alice@gmail.com",
                "+08987878787",
                LocalDate.of(2000,1, 1)
        );

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);


//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isValid(customer));
    }

}
