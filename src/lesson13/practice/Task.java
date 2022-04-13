/**
 * Practical task:
 * <p>
 * In the next method calculate amount of characters in the string. Need to find logic errors
 */
package lesson13.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        try {
            testWord = br.readLine();
            System.out.println("Input character");
            character = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < testWord.length(); i++) {
            character = testWord.substring(1, 1);
            if (character.equals(character)) countCharacters++;
        }
        System.out.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);

    }
}
