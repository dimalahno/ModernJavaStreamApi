package streams_terminal;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.List;

import data.Student;
import data.StudentDataBase;

public class StreamsMappingExample {

    public static void main(String[] args) {


        List<String> studentNames = StudentDataBase.getAllStudents()
                                                   .stream()
                                                   .collect(mapping(Student::getName, toList()));

        System.out.println(studentNames);
    }
}
