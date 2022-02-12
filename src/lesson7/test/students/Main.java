package lesson7.test.students;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(52645, "Oksana");
        students[1] = new Student(98765, "Bogdan");
        students[2] = new Student(1354, "Orest");
        students[3] = new Student(1355, "Orest");


        Arrays.sort(students, Comparator.reverseOrder());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
