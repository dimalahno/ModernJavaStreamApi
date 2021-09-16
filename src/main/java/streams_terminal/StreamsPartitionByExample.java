package streams_terminal;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsPartitionByExample {

    public static void partitioningBy_1() {

        Predicate<Student> gpaFilter = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                                                                     .stream()
                                                                     .collect(partitioningBy(gpaFilter));

        System.out.println(partitioningMap);
    }

    public static void partitioningBy_2() {

        Predicate<Student> gpaFilter = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents()
                                                                    .stream()
                                                                    .collect(partitioningBy(gpaFilter ,
                                                                              toSet()));

        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
    }
}
