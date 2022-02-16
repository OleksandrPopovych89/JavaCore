package lesson9.homework.task3;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {

        Iterator<Student> iterator = students.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (iterator.next().getCourse() == course) {
                if (count < 2) {
                    System.out.println("Finding students of " + course + " course:");
                }
                System.out.println(iterator.next());
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Student of " + course + " course is not find.");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + '}';
    }
}