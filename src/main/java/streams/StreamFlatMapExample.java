package streams;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import data.Student;
import data.StudentDataBase;

public class StreamFlatMapExample {

    public static Set<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toSet());
    }

    public static void main(String[] args) {
        printStudentActivities().forEach(System.out::println);
    }
}
