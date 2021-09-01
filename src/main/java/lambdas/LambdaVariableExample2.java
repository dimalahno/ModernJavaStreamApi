package lambdas;

import java.util.function.Consumer;

public class LambdaVariableExample2 {

    static int value = 4;

    public static void main(String[] args) {

//        int value = 4; // local variable

        Consumer<Integer> c1 = (i)-> {
            value++;
            System.out.println(value + i);
        };

        value = 6;

        c1.accept(4);
    }
}
