/*
Homework task.
Task 3.

Implement a pattern for US currency: the first symbol "$", then any number of digits,
dot and two digits after the dot.
Enter the text from the console that contains several occurrences of US currency.
Display all occurrences on the screen.
 */
package lesson10.homework.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        String[] cases = new String[]{
                "$100.00",
                "$100.15",
                "$100.150",
                "€100.00",
                "$100",
                "100$",
                "100.00$",
                "100$",
        };

        String dollarsUsaRegex = "\\$*[0-9]*.[0-9]{2}";
        Pattern p = Pattern.compile(dollarsUsaRegex);
        Matcher m;

        for (String aCase : cases) {
            m = p.matcher(aCase);
            if (m.matches()) {
                System.out.printf("%s is a valid representation\n", aCase);
            } else {
                System.out.printf("%s is a invalid representation\n", aCase);
            }
        }
    }
}
