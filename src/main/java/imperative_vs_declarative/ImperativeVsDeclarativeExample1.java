package imperative_vs_declarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {
        /*
         * Imperative - how styling of programming
         */

        int sum = 0;

        for (int i = 0; i <= 100 ; i++) {
            sum += i;
        }

        System.out.println("imperative.sum: " + sum);

        /*
         * Declarative Style of Programming
         */

        int sum1 = IntStream.rangeClosed(0, 100)
                            .parallel()
                            .sum();

        System.out.println("declarative.sum: " + sum1);
    }

}
