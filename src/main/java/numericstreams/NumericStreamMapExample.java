package numericstreams;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class  NumericStreamMapExample {

    public static List<Integer> mapToObject() {
        return IntStream.rangeClosed(1, 5)
                .boxed()
                .collect(toList());
    }

    public static void main(String[] args) {
        mapToObject().forEach(System.out::println);
    }

}
