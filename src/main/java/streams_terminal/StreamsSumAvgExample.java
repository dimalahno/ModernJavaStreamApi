package streams_terminal;


import static java.util.stream.Collectors.averagingInt;

import data.Student;
import data.StudentDataBase;

public class StreamsSumAvgExample {

    public static int sumNotebooks() {
        return StudentDataBase.getAllStudents()
                              .stream()
                              .mapToInt(Student::getNotebooks)
                              .sum();
    }

    public static double avgNotebooks() {
        return StudentDataBase.getAllStudents()
                              .stream()
                              .collect(averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("sum notebooks: " + sumNotebooks());
        System.out.println("avg notebooks: " + avgNotebooks());
    }
}
