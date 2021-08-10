package functional_interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class FunctionExampleStudent {

    static Predicate<Student> gradleLevelFilter = student -> student.getGradeLevel()>=3;
    static Predicate<Student> gpaFilter = student -> student.getGpa()>=3.9;

    static Function<List<Student>, Map<String, Double>> studentFunction = students -> {
        Map<String, Double> studentGradMap = new HashMap<>();

        students.forEach(student -> {
            if (gradleLevelFilter.and(gpaFilter).test(student)){
                studentGradMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGradMap;
    };

    public static void main(String[] args) {

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

    }
}
