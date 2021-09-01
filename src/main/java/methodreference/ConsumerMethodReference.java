package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReference {
    static List<Student> studentList = StudentDataBase.getAllStudents();

    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        studentList.forEach(c1);
        studentList.forEach(c2);
    }
}
