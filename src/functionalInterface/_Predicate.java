package functionalInterface;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("0243653651"));
        System.out.println(isPhoneNumberValid("0548670632"));


//        Predicate form of phone Validation
        System.out.println("With Predicate");
        System.out.println("Predicate: "+ isPhoneNumberValidPredicate.test("0548670632"));
        System.out.println("Predicate: "+ isPhoneNumberValidPredicate.test("0243653651"));


        System.out.println("Phone Number is valid and contains: " +
                isPhoneNumberValidPredicate.and(contains3).test("0243653651"));

        System.out.println("Phone Number is valid and contains: " +
                isPhoneNumberValidPredicate.and(contains3).test("0548670632"));
    }

//    PhoneNumber Validation using traditional java function
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("054") && phoneNumber.length()==10;
    }

//    Using functional interface for PhoneNumber Validation
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("054") && phoneNumber.length()==10;
//    Predicates can also be combined just as we did for the function adding 1 & multiply by 10

    static Predicate<String> contains3 = phoneNumber ->
            phoneNumber.contains("3");
}
