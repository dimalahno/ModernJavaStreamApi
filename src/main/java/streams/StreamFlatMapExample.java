package streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import data.Student;
import data.StudentDataBase;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
    }

    public static long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents().stream()
                              .map(Student::getActivities)
                              .flatMap(List::stream)
                              .distinct()
                              .count();
    }

    public static void main(String[] args) {
        printStudentActivities().forEach(System.out::println);
        System.out.println(getStudentActivitiesCount());
    }
}
