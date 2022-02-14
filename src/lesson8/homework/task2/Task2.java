/*
Homework task.
Task 2.

- Create Wrapper<T> class with private field of T type which is called value.
- In Wrapper class create public constructor and setValue and getValue methods for value field.
- Create three objects of the Wrapper type: first object should be wrapper for int type,
second – for String, third - for boolean.
- Print all three values in the console using method getValue from Wrapper class.
 */
package lesson8.homework.task2;

public class Task2 {
    public static void main(String[] args) {

        Wrapper<Integer> intWrapper = new Wrapper<Integer>(10);
        Wrapper<String> stringWrapper = new Wrapper<String>("Some string");
        Wrapper<Boolean> boolWrapper = new Wrapper<Boolean>(true);

        System.out.println(intWrapper.getValue());
        System.out.println(stringWrapper.getValue());
        System.out.println(boolWrapper.getValue());

    }
}
