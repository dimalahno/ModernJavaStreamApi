package functional_interfaces;


import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateAndConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Predicate<Student> gradleLevelFilter = student -> student.getGradeLevel()>=3;
    static Predicate<Student> gpaFilter = student -> student.getGpa()>=3.9;

    static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.println(name + " : " + activities);
    };

    static Consumer<Student> studentConsumer = (student) -> {
//        if (gradleLevelFilter.and(gpaFilter).test(student)){
//            biConsumer.accept(student.getName(), student.getActivities());
//        }
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void printNameActivities() {
        System.out.println("printNameActivities");
        studentList.forEach(studentConsumer);

    }

    public static void main(String[] args) {
        printNameActivities();
    }
}
