/*
Homework task.
Task 2.

Enter a sentence that contains the words between more than one space.
Convert all spaces, consecutive, one.
For example, if we introduce the sentence "I'    am      learning     Java   Core»,
we have to get the "I'm learning Java Core»
 */
package lesson10.homework.task2;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "I'    am      learning     Java   Core";//Simulation of console input.

        String[] splitSentence = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : splitSentence) {
            if (!s.isEmpty()) {
                if (s.contains("'")) {
                    stringBuilder.append(s);
                } else {
                    stringBuilder.append(s + " ");
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
