package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
    Customer amigoscode = new Customer("Amigoscode", "0548670632");
     greetCustomer(amigoscode);

//     Functional Interface of Consumer Implementation
     greetCustomerConsumer.accept(new Customer("Godfred A. Asumadu", "054-867-0632"));

//    Bi Consumer, takes 2 arguments, if false hides phoneNumber but true shows the phoneNumber
     Customer stephen = new Customer("Stephen Mensah","024 216 7201");
     greetCustomerConsumerV2.accept( stephen, true);


    }

//    NOTE: Normal Java Implementation
    static  class Customer{
        private static String customerName;
        private static String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            Customer.customerName = customerName;
            Customer.customerPhoneNumber = customerPhoneNumber;
        }
    }

    static  void greetCustomer(Customer customer){
        System.out.println("Hello " + Customer.customerName + ", thanks for registering, Phone Number is "
                + Customer.customerPhoneNumber);

    }

//    Consumer Function Interface Implementation, takes in a variable of type Customer from the customer created class
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + Customer.customerName + ", thanks for registering, Phone Number is "
                    + Customer.customerPhoneNumber);

    //    Bi Consumer
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + Customer.customerName + ", thanks for registering, Phone Number is "
                    + (showPhoneNumber ? Customer.customerPhoneNumber: "************"));


}
