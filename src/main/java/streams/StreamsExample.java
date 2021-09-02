package streams;


import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsExample {

    static Predicate<Student> gradleLevelFilter = student -> student.getGradeLevel()>=3;
    static Predicate<Student> gpaFilter = student -> student.getGpa()>=3.9;

    public static void main(String[] args) {

        // student name and there activities in map

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                                                              .peek(System.out::println)
                                                              .filter(gradleLevelFilter)
                                                              .peek(student -> System.out.println("after 1-st filter: " + student))
                                                              .filter(gpaFilter)
                                                              .peek(student -> System.out.println("after 2-nd filter: " + student))
                                                              .collect(Collectors.toMap(Student::getName,
                                                                                        Student::getActivities));

        System.out.println(studentMap);
    }
}
