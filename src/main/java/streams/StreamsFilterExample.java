package streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import data.Student;
import data.StudentDataBase;

public class StreamsFilterExample {

    public static List<Student> filterListOfStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa()>3.9)
                .collect(toList());
    }

    public static void main(String[] args) {
        filterListOfStudents().forEach(System.out::println);
    }

}
