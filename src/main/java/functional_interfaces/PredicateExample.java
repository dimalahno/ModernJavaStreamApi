package functional_interfaces;


import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> even = (i) -> i % 2 == 0;
    static Predicate<Integer> divideBy5 = (i) -> i % 5 == 0;

    public static void predicateAnd() {
        //check even and divide by 5
        System.out.println("predicateAnd");
        System.out.println(even.and(divideBy5).test(10)); // predicate chaining
        System.out.println(even.and(divideBy5).test(22)); // predicate chaining
    }

    public static void predicateOr() {
        //check even or divide by 5
        System.out.println("predicateOr");
        System.out.println(even.or(divideBy5).test(10)); // predicate chaining
        System.out.println(even.or(divideBy5).test(22)); // predicate chaining
    }

    public static void predicateNegate() {
        //negate reverse result
        System.out.println("predicateNegate");
        System.out.println(even.or(divideBy5).negate().test(10)); // predicate chaining
        System.out.println(even.or(divideBy5).negate().test(9)); // predicate chaining
    }

    public static void main(String[] args) {
        System.out.println(even.test(4));
        System.out.println(even.test(5));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
