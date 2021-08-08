package functional_interfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateStudentExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    static Predicate<Student> gradleLevelFilter = student -> student.getGradeLevel()>=3;
    static Predicate<Student> gpaFilter = student -> student.getGpa()>=3.9;



    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel");
        studentList.forEach(student -> {
            if (gradleLevelFilter.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGradeLevelAngGpa() {
        System.out.println("filterStudentByGradeLevelAngGpa");
        studentList.forEach(student -> {
            if (gradleLevelFilter.and(gpaFilter).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGradeLevelAngGpaNegate() {
        System.out.println("filterStudentByGradeLevelAngGpaNegate");
        studentList.forEach(student -> {
            if (gradleLevelFilter.and(gpaFilter).negate().test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGradeLevelAngGpa();
        filterStudentByGradeLevelAngGpaNegate();
    }
}
