package parallel_stream;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList) {

        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("DurationS: " + (endTime - startTime));
        return sum;
    }


    public static int parallelSum(List<Integer> integerList) {

        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                             .parallel()
                             .reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("DurationP: " + (endTime - startTime));
        return sum;
    }


    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1, 10000000)
                .boxed()
                .collect(toList());

        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
