package functional_interfaces;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDataBase;

public class BiConsumerExample {



    public static void nameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name + " : " + activities);
        };
        studentList.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a:" + a + ", b:" + b);
        };

        biConsumer.accept("java8", "java11");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication is " + (a * b));
        };

        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("Multiplication is " + (a / b));
        };

        multiply.accept(11, 22);
        division.accept(121, 11);

        System.out.println("-----------");
        nameAndActivities();
    }

}
