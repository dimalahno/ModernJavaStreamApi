package streams_terminal;

import static java.util.stream.Collectors.joining;

import data.Student;
import data.StudentDataBase;

public class StreamsJoiningExample {

    public static String joiningNames() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    }

    public static String joiningNamesWithDelimiter() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining(" "));
    }

    public static String joiningNamesWithDelimiterAndPrefixAndSuffix() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining(", ", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println(joiningNames());
        System.out.println(joiningNamesWithDelimiter());
        System.out.println(joiningNamesWithDelimiterAndPrefixAndSuffix());
    }
}
