/*
Homework task.
Task 3.

Write class Student that provides information about the name of the student and his course.
Class Student should consist of
    a) properties for access to these fields
    b) constructor with parameters
    c) method printStudents (List students, Integer course),
which receives a list of students and the course number
and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
    d) methods to compare students by name and by course
    e) In the main() method
- declare List students and add to the list five different students
- display the list of students ordered by name
- display the list of students ordered by course.
 */
package lesson9.homework.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Igor", 4));
        students.add(new Student("Vasyl", 5));
        students.add(new Student("Eva", 1));
        students.add(new Student("Marya", 5));
        students.add(new Student("Oleg", 6));

        int course = 4;
        Student.printStudents(students, course);

        System.out.println("Students not sorted:");
        System.out.println(students);
        System.out.println();


        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Students after sorted by name.");
        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCourse() != o2.getCourse()) {
                    return o1.getCourse() - o2.getCourse();
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        System.out.println("Students after sorted by course.");
        System.out.println(students);
    }
}