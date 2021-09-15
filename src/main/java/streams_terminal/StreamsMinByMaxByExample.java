package streams_terminal;

import java.util.Comparator;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minByStudent(){
        return StudentDataBase.getAllStudents()
                              .stream()
                              .min(Comparator.comparing(Student::getGpa));
    }

    public static Optional<Student> maxByStudent(){
        return StudentDataBase.getAllStudents()
                              .stream()
                              .max(Comparator.comparing(Student::getGpa));
    }

    public static void main(String[] args) {
        minByStudent().ifPresent(System.out::println);
        maxByStudent().ifPresent(System.out::println);
    }
}
