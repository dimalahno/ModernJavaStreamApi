package optional;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class OptionalOrElseExample {

    // orElse
    public static String optionalOrElse() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//        Optional<Student> studentOptional = Optional.ofNullable(null);

        return studentOptional.map(Student::getName).orElse("Default");
    }

    // orElseGet
    public static String optionalOrElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        return studentOptional.map(Student::getName).orElseGet(() -> "Default");
    }
    // orElseThrow
    public static String optionalOrElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Available"));
    }


    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        optionalOrElseThrow();
    }
}
