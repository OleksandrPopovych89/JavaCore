/*
Practical task.
Task 3.

The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
Using regular expressions implement checking the user name for validity.
Input five names in the main method .
Output a message to the console of the validation of each of the entered names.
 */
package lesson10.practice.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] users = new String[5];

        for (int i = 0; i < 5; i++) {
            users[i] = reader.readLine();
        }
        String user_regex = "[a-zA-Z0-9_]{3,15}";
        Pattern p = Pattern.compile(user_regex);

        Matcher m;

        for (int i = 0; i < 5; i++) {
            m = p.matcher(users[i]);
            if (m.matches()) {
                System.out.printf("%s is valid\n", users[i]);
            } else {
                System.out.printf("%s is invalid\n", users[i]);
            }
        }
    }
}
