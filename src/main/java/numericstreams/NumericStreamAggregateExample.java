package numericstreams;

import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("sum is: " + sum);

        IntStream.rangeClosed(1, 50).max().ifPresent(value -> System.out.println("max is: " + value));
        IntStream.rangeClosed(1, 50).min().ifPresent(value -> System.out.println("min is: " + value));
        IntStream.rangeClosed(1, 49).average().ifPresent(value -> System.out.println("average is: " + value));

    }
}
