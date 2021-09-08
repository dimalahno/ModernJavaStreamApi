package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxMinExample {

    public static Optional<Integer> findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                          .reduce(Integer::max);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream()
                          .reduce(Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

        findMaxValue(integerList).ifPresent(System.out::println);
        findMinValue(integerList).ifPresent(System.out::println);
    }
}
