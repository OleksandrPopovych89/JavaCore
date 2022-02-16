/*
Homework task.
Task 2.

Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
Output the entities of the map on the screen.
There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */
package lesson9.homework.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Netrebko", "Valerii");
        personMap.put("Pokydko", "Vasyl");
        personMap.put("Galushka", "Orest");
        personMap.put("Hmeliv", "Orest");
        personMap.put("Ovcharenko", "Oleksandr");
        personMap.put("Zinovev", "Orest");
        personMap.put("Talunova", "Victoria");
        personMap.put("Polovina", "Mariya");
        personMap.put("Nazarov", "Oleksandr");
        personMap.put("Kryvonis", "Stepan");

        System.out.println(personMap);

        String removingName = "Orest";
        List<String> list = new LinkedList<>();

        for (Map.Entry<String, String> entry : personMap.entrySet())
            if (entry.getValue().equals(removingName)) {
                list.add(entry.getKey());
            }
        for (String s : list) {
            personMap.remove(s);
        }
        System.out.println(personMap);
    }
}
