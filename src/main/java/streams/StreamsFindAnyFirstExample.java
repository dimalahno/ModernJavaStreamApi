package streams;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        findAnyStudent().ifPresent(System.out::println);
        findFirstStudent().ifPresent(System.out::println);
    }
}
