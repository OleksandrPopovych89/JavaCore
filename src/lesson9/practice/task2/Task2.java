/*
Practical task.
Task 2.

In the main() method declare map employeeMap of pairs <Integer, String>.
- Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
- Ask user to enter ID, then find and write corresponding name from your map.
If you can't find this ID - say about it to user (use function containsKey()).
- Ask user to enter name, verify than you have name in your map and write corresponding ID.
 If you can't find this name - say about it to user (use function containsValue()).
 */
package lesson9.practice.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) throws IOException {

        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Victor");
        employeeMap.put(102, "Igor");
        employeeMap.put(103, "Svitlana");
        employeeMap.put(104, "Valentyna");

        System.out.println(employeeMap);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter employee ID:");
        Integer id = Integer.parseInt(bufferedReader.readLine());


        boolean flag = employeeMap.containsKey(id);
        if (flag == true) {
            System.out.println("Finding user is: " + employeeMap.get(id));
        } else {
            System.out.println("User not found by this key.");
        }
        System.out.print("Enter employee name:");
        String name = bufferedReader.readLine();

        flag = employeeMap.containsValue(name);
        if (flag == true) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
                if (entry.getValue().equals(name)) {
                    System.out.println("User " + name + " have id: " + entry.getKey());
                }
        } else {
            System.out.println("Key not found for this username.");
        }
    }
}