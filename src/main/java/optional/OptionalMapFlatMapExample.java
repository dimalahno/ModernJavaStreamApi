package optional;

import java.util.Optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

public class OptionalMapFlatMapExample {

    // filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa()>=3.5)
                .ifPresent(System.out::println);
    }

    // map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(studentOptional.isPresent()){
//            Optional<String> name = studentOptional.filter(student -> student.getGpa()>=3.5)
//                    .map(Student::getName);
//            name.ifPresent(System.out::println);

            studentOptional
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName)
                    .ifPresent(System.out::println);
        }

    }


    // flatMap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(studentOptional.isPresent()){
            studentOptional
                    .filter(student -> student.getGpa()>=3.5)
                    .flatMap(Student::getBike)
                    .map(Bike::getName)
                    .ifPresent(System.out::println);
        }

    }


    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
