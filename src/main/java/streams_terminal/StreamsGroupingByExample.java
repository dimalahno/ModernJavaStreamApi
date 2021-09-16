package streams_terminal;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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
                                                               .collect(groupingBy(student -> student.getGpa() >= 3.8
                                                                       ? "OUTSTANDING"
                                                                       : "AVERAGE"));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping() {
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                                                                             .stream()
                                                                             .collect(groupingBy(Student::getGradeLevel,
                                                                                                 groupingBy(student ->
                                                                                                                    student.getGpa() >=
                                                                                                                            3.8
                                                                                                                            ? "OUTSTANDING"
                                                                                                                            : "AVERAGE")));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                                                          .stream()
                                                          .collect(groupingBy(Student::getGradeLevel,
                                                                              summingInt(Student::getNotebooks)));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_3() {
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                                                         .stream()
                                                         .collect(groupingBy(Student::getName,
                                                                             summingInt(Student::getNotebooks)));

        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                                                                                  .stream()
                                                                                  .collect(groupingBy(Student::getName,
                                                                                                      LinkedHashMap::new,
                                                                                                      toSet()));

        System.out.println(studentLinkedHashMap);
    }

    public static void calculateTopGpa() {
        Map<Integer, Optional<Student>> optionalMap = StudentDataBase.getAllStudents()
                               .stream()
                               .collect(groupingBy(Student::getGradeLevel,
                                                   maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(optionalMap);

        Map<Integer, Student> optionalMap1 =
                StudentDataBase.getAllStudents()
                     .stream()
                     .collect(groupingBy(Student::getGradeLevel,
                                         collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                                         Optional::get)));

        System.out.println(optionalMap1);
    }

    public static void calculateListGpa() {
        Map<Integer, Optional<Student>> optionalMap = StudentDataBase.getAllStudents()
                                                                     .stream()
                                                                     .collect(groupingBy(Student::getGradeLevel,
                                                                                         minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(optionalMap);

        Map<Integer, Student> optionalMap1 =
                StudentDataBase.getAllStudents()
                               .stream()
                               .collect(groupingBy(Student::getGradeLevel,
                                                   collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),
                                                                     Optional::get)));

        System.out.println(optionalMap1);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        customizeGroupStudentsByGender();
        twoLevelGrouping();
        twoLevelGrouping_2();
        twoLevelGrouping_3();
        threeArgumentGroupBy();
        calculateTopGpa();
        calculateListGpa();
    }
}
