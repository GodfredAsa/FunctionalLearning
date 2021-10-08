package javaOptionals;

import java.util.Optional;

public class Main {
//    Java OPTIONALS is used for handling NULL POINTERS

    public static void main(String[] args) {


//        optional of empty
        System.out.println("******   Optional empty ******");
        Optional<String> hello = Optional.ofNullable(null);
        System.out.println(hello);
        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());

        String orElse1 = hello
                .map(String::toUpperCase)
                .orElseGet( ()-> {
//                        perform extra work to obtain the value you want to get
                            return "-> World <-";
                        }
                );
        System.out.println(orElse1);

        hello.ifPresentOrElse(
                System.out::println, () -> System.out.println("World")
        );


//        optional of
        System.out.println("******  Optional of *******");
        Optional<Object> emptyOptional2 = Optional.of("Hello");
        System.out.println(emptyOptional2.isEmpty());
        System.out.println(emptyOptional2.isPresent());

        System.out.println("\n");
        Optional<Object> emptyOptional3 = Optional.ofNullable("hello");
        System.out.println(emptyOptional3);
    }
}
