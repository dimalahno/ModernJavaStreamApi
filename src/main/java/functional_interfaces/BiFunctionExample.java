package functional_interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class BiFunctionExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Predicate<Student> gradleLevelFilter = student -> student.getGradeLevel()>=3;

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {
        Map<String, Double> studentGradMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                studentGradMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(studentList, gradleLevelFilter));
    }
}
