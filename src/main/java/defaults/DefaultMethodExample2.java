package defaults;


import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class DefaultMethodExample2 {

    static Consumer<Student> printList = System.out::println;
    static Comparator<Student> byName = Comparator.comparing(Student::getName);
    static Comparator<Student> byGPA = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> byGrade = Comparator.comparingDouble(Student::getGradeLevel);

    public static void sortWithNullValues(List<Student> studentList) {

        Comparator<Student> comparator = Comparator.nullsLast(byName);
        studentList.sort(comparator);
        studentList.forEach(printList);
    }


    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

//        studentList.sort(byName);
//        studentList.sort(byGPA);
//        studentList.sort(byGrade.thenComparing(byName));
//        studentList.forEach(printList);

        sortWithNullValues(studentList);



    }
}
