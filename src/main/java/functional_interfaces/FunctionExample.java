package functional_interfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> f1 = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.concat(" default");

    public static void main(String[] args) {
        System.out.println("Result is : " + f1.apply("Java 11"));

        System.out.println("Result is : " + f1.andThen(addSomeString).apply("Java 11"));

        System.out.println("Result is : " + f1.compose(addSomeString).apply("Java 11"));
    }
}
