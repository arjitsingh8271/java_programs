/*
● Supplier<T> is a functional interface in Java (introduced in Java 8) that represents a function that does not take any input but returns an output.
● It is part of java.util.function package.
● Takes no input, returns one output.
● It has only one abstract method:    T get();
● Common Use Cases:
    Generating random numbers.
    Fetching system properties.
    Creating database connections.
    Lazy initialization (delaying object creation until needed).

Method                                                          Description
------                                                          ------------    
T get()                                                         Returns a value of type T
default Supplier<T> and(Supplier<? extends T> after) (Java 9)   Chains two Supplier<T> functions

*/


import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;


public class Supplier01 {
    public static void main(String[] args) {

        // Eg1:
        Supplier<Integer> Supplier = () -> 1;
        System.out.println(Supplier.get());     // 1


        // Eg2:
        // Supplier to generate a random number
        Supplier<Double> randomNumber = () -> Math.random();
        
        // Calling get() method to get a random value
        System.out.println("Random Number: " + randomNumber.get());


        // Eg3:     Predicate, Function, Consumer & Supplier
        Predicate<Integer> pre = x -> x % 2 == 0;
        Function<Integer, Integer> fun = x -> x * x;
        Consumer<Integer> con = x -> System.out.println(x);
        Supplier<Integer> sup = () -> 10;

        if (pre.test(sup.get())) {
            con.accept(fun.apply(sup.get()));   // 100
        }
    }
}
