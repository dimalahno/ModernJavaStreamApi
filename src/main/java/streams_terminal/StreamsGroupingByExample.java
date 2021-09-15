package streams_terminal;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

import java.util.List;
import java.util.Map;

import data.Student;
import data.StudentDataBase;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                                                               .stream()
                                                               .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizeGroupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                                                               .stream()
                                                               .collect(groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping() {
        Map<Integer, Map<String, List<Student>>> studentMap =   StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                                    groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {
        Map<Integer, Integer> studentMap =   StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNotebooks)));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_3() {
        Map<String, Integer> studentMap =   StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNotebooks)));

        System.out.println(studentMap);
    }

    public static void main(String[] args) {
//        groupStudentsByGender();
//        customizeGroupStudentsByGender();
//        twoLevelGrouping();
//        twoLevelGrouping_2();
        twoLevelGrouping_3();
    }
}
