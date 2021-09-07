package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsMapExample {

    public static List<String> namesList() {
        return StudentDataBase.getAllStudents().stream()
                              .map(Student::getName)
                              .map(String::toUpperCase)
                              .collect(Collectors.toList());
    }

    public static Set<String> namesSet() {
        return StudentDataBase.getAllStudents().stream()
                              .map(Student::getName)
                              .map(String::toUpperCase)
                              .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        namesList().forEach(System.out::println);
        System.out.println();
        namesSet().forEach(System.out::println);
    }
}
