package optional;


import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class OptionalExample {

    public static String getStudentName() {
        Student student = StudentDataBase.studentSupplier.get();
//        Student student = null;
        if (student != null) {
            return student.getName();
        } else {
            return null;
        }
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentName();
        if (name != null) {
            System.out.println("Length of student name: " + name.length());
        } else {
            System.out.println("Name not found ");
        }


        Optional<String> studentName = getStudentNameOptional();
        studentName.ifPresent((nameS) -> System.out.println("Length of student name: " + nameS.length()));
    }
}
