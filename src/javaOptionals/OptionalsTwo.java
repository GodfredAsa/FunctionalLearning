package javaOptionals;

import java.util.Optional;

public class OptionalsTwo {
    public static void main(String[] args) {

        Optional.ofNullable("fred.epals.com")
                .ifPresentOrElse(email -> System.out.println("Sending message to " + email), () ->
                        System.out.println("Email Not Available"));
    }
}
