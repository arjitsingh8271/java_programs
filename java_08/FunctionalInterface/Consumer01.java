/*
● Consumer<T> is a functional interface in java.util.function package that represents an operation that accepts a single input but does not return a result.
● Takes one input, but returns nothing (void).
● Used for printing, logging, or modifying data.
● Works well with Lambda Expressions.
● It is part of the java.util.function package.

Method                      Description
------                      -----------
accept(T t)                 Takes an input and performs an action (no return value).
andThen(Consumer<T> after)  Chains multiple Consumers to execute sequentially.

*/


import java.util.function.Consumer;
import java.util.List;

public class Consumer01 {
    public static void main(String[] args) {

        // Eg1:
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, Java!");


        // Eg2:
        Consumer<List<Integer>> list = x -> {
            for (Integer i: x) {
                System.out.println(i+10);   // 11 12 13 14
            }
        };
        list.accept(List.of(1,2,3,4));  


        // andThen(Consumer<T> after)
        Consumer<List<Integer>> list2 = x -> {
            for (Integer i: x) {
                System.out.println(i);
            }
        };
        list2.andThen(list).accept(List.of(1,2,3,4));

            // 1 2 3 4
            // 11 12 13 14

    }
}
