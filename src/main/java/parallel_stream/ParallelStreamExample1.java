package parallel_stream;

import static java.util.stream.Collectors.toList;

import java.util.List;

import data.Student;
import data.StudentDataBase;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                                                        .stream()
                                                        .map(Student::getActivities)
                                                        .flatMap(List::stream)
                                                        .distinct()
                                                        .sorted()
                                                        .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration1: " + (endTime - startTime));

        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                                                        .stream()
                                                        .parallel()
                                                        .map(Student::getActivities)
                                                        .flatMap(List::stream)
                                                        .distinct()
                                                        .sorted()
                                                        .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration2: " + (endTime - startTime));

        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }

}
