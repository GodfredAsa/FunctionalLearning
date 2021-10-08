package javaOptionals;

import java.util.Optional;

public class OptionalAdvance {
    public static void main(String[] args) {

        Person james = new Person("James", null);
        Person kaka = new Person("Kaka", "james@utl.com");

/**
 * gives null Pointer Exception to fix this we wrap the getEmail()
 * with an Optional
 */

// Method 1 Implementation
        System.out.println(
                james.getEmail()
                        .map(String::toLowerCase)
                        .orElse("Email not provided")
        );

//        System.out.println(
//                kaka.getEmail()
//                        .map(String::toLowerCase)
//                        .orElse("Email not provided")
//        );

//        Method 2
        if (kaka.getEmail().isPresent()) {
            String email = kaka.getEmail().get();
            System.out.println(email);
        } else
            System.out.println("Email not Provided");
    }

    static class Person {
        private String name;
        private String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        // Optional Implementation
        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }

}