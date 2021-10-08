package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

// Functional Interface Outputs
        System.out.println("Functional Interface type ");
        int increment2 = incrementByOneFunction.apply(31);
        System.out.println("Result of increment: " +increment2);

//        incrementByOneMultiplyByTen
       int addAndMultiply = incrementByOneFunction.andThen(multiplyByTenFunction).apply(49);
        System.out.println("add 1 and multiply 10: " + addAndMultiply);


//        Bi function implementation of the two simple function combines
        System.out.println(incrementByOneMultiplyByTen.apply(10, 8));

    }

// Functional Interface Guide
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number *10;

//    Bi Functional Implementation
   static BiFunction<Integer, Integer, Integer> incrementByOneMultiplyByTen = (addOne, Multiplier) -> (addOne + 1 )* Multiplier;


//    Bi Function takes 2 inputs and produces 2 outputs




}
