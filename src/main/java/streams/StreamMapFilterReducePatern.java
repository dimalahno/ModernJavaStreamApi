package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapFilterReducePatern {

    private static int numberOfNotebooks () {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(numberOfNotebooks());
    }
}
