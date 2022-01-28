/*
Create Console Application project in Java.
Add class Person to the project.
Class Person should consist of
a) three private fields: firstName, lastName and birthYear (the birthday year)
b) properties for access to these fields
c) default constructor and constructor with 2 parameters (first and last names)
d) methods:
getAge() - to calculate the age of person
input() - to input information about person
output() - to output information about person
changeName(String fn, String ln) - to change the first name or/and last name of person

In the method main() create 5 objects of Person type and input information about them.
 */

package lesson3.homework;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Alex", "Popovych");
        person1.setBirthYear(1989);

        Person person2 = new Person();
        person2.input("Igor", "Bikeev", 1985);

        Person person3 = new Person();
        person3.input("Oleg", "Sgvets", 1965);

        Person person4 = new Person();
        person4.input("Anastasia", "Kornienko", 1987);

        Person person5 = new Person();
        person5.input("Julia", "Pankevych", 1988);


        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

    }
}
