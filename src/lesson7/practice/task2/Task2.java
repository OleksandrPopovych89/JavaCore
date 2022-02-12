/*
Practical task.
Task 2.

Create next structure. In abstract class Person with property name, declare abstract method print().
In other classes in body of method print() output text “I am a …”. In class Staff declare abstract method salary()
In each concrete class create constant TYPE_PERSON. Output type of person in each constructor.
Create array of Person and add some Teachers, Cleaners and Students to it. Call method print() for all of it.
Call method salary() for all Teachers and Cleaner


 */
package lesson7.practice.task2;

public class Task2 {
    public static void main(String[] args) {

        Person[] people = new Person[]{
                new Student("Bill", "sanguine"),
                new Teacher("Jack", "Choleric"),
                new Cleaner("Josh", "Melancholic"),
        };

        callAllMethods(people);
    }

    private static void callAllMethods(Person[] people) {
        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println();
        }
    }
}