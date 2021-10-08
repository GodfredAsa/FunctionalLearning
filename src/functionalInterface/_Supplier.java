package functionalInterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println("Supplier: "+ getDBConnectionUrlPredicateVersion.get());

        System.out.println("Lists of Names with Supplier: " + ListItems.get());

    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:8080/users";
    }

    static Supplier<String> getDBConnectionUrlPredicateVersion = ()
            -> "jdbc://localhost:8080/users";

//    Write a functional interface on supplier to return a list of names
    static Supplier<List<String>> ListItems  = () ->
        List.of("Fred", "Hanna", "Jones");
}
