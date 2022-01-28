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

import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        Date date = new Date();
        return date.getYear() + 1900 - this.birthYear;
    }

    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.println("Person " + this.firstName + " " + this.lastName + " "
                + this.birthYear + " birth year.");
    }

    public void changeName(String fn, String ln) {
        if (fn != null) {
            this.firstName = fn;
        }
        this.lastName = ln;
    }
}