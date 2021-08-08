package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);

        System.out.println(comparator.compare(2, 3));
        System.out.println(comparator.compare(3, 2));
        System.out.println(comparator.compare(3, 3));
    }

}
