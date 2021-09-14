package streams_terminal;


import static java.util.stream.Collectors.counting;

import data.StudentDataBase;

public class StreamsCountingExample {

    public static long countStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println(countStudents());
    }
}
