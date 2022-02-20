/*
Homework task.
Task 1.

Enter from the console sentence of five words.
- display the longest word in the sentence
- determine the number of its letters
- bring the second word in reverse order
 */
package lesson10.homework.task1;

public class Task1 {
    public static void main(String[] args) {
        String fiveWords = "Today is a good day";//Simulation of console input.
        String[] splitWords = fiveWords.split(" ");

        System.out.printf("Longest word is: \"%s\"\n", getLongestWord(splitWords));
        System.out.printf("Its has %d letters\n", getNumberOfLetters(getLongestWord(splitWords)));
        System.out.printf("Reverse second word is \"%s\"\n", getSecondWordInReverse(splitWords));
    }

    private static String getLongestWord(String[] splitWords) {
        String longestWord = "";
        for (String splitWord : splitWords) {
            if (splitWord.length() > longestWord.length()) {
                longestWord = splitWord;
            }
        }
        return longestWord;
    }

    private static int getNumberOfLetters(String word) {
        return word.length();
    }

    private static String getSecondWordInReverse(String[] splitWords) {
        StringBuilder stringBuilder = new StringBuilder(splitWords[2 - 1]);
        return stringBuilder.reverse().toString();
    }
}
