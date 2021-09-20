package parallel_stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 10000000)
                        .sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1, 10000000)
                        .parallel()
                        .sum();
    }

    public static void main(String[] args) {
        System.out.println(sumSequentialStream());
        System.out.println(sumParallelStream());

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential: " + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("Parallel: " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
    }
}
