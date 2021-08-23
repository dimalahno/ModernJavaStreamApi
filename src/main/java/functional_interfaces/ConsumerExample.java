package functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {

    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printName() {
        System.out.println("printName");
        studentList.forEach(c2);
    }

    public static void printNameActivities() {
        System.out.println("printNameActivities");
        // consumer chaining
        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameActivitiesUsingCondition() {
        System.out.println("printNameActivitiesUsingCondition:");
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa()>=3.9){
                c3.andThen(c4).andThen(c2).accept(student);
            }
        })); // consumer chaining
    }

    public static void main(String[] args) {
        printName();
        System.out.println("--------------------------");
        printNameActivities();
        System.out.println("--------------------------");
        printNameActivitiesUsingCondition();
    }
}
