package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel()>=2;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
        System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
    }
}
