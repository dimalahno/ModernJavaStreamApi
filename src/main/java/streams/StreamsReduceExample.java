package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integers) {

        return integers.stream()
                       .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {

        return integers.stream()
                       .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> emptyInteger = Collections.emptyList();
        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        result.ifPresent(System.out::println);

        Optional<Integer> resultWithEmptyList = performMultiplicationWithoutIdentity(emptyInteger);
        System.out.println(resultWithEmptyList.isPresent());
        resultWithEmptyList.ifPresent(System.out::println);

        Optional<Student> studentOptional = getHighestGPAStudent();
        studentOptional.ifPresent(System.out::println);
    }
}
