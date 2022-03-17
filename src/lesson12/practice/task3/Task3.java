/**
Practical task.
Task 3:

Prepare file.txt file with a lot of text inside.
Read context from file into array of strings.
Each array item contains one line from file.
Complete next tasks:
   1) count and write the number of symbols in every line.
   2) find the longest and the shortest line.
   3) find and write only that lines, which consist of word «var»
 */
package lesson12.practice.task3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {

        String fileName = "src/lesson12/tasks/task3/file.txt";
        FileReader fr = null;
        BufferedReader br = null;
        int count = 0;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;
            System.out.println("Read data from " + fileName);

            while ((s = br.readLine()) != null) {
                count++;
                if (CountSymbols(s) > 0) {
                    System.out.println("Line " + count + " has " + CountSymbols(s) + " symbols.");
                    IsShortestLongest(s, count);
                    IsFinding(s, "var", count);
                } else {
                    System.out.println("Line " + count + " is empty.");
                }

            }
            System.out.println("Longest line has " + longest + " symbols.");
            System.out.println("Longest line is number " + numLongest + ".");

            System.out.println("Shortest line has " + shortest + " symbols.");
            System.out.println("Shortest line is number " + numLongest + ".");

            System.out.println();

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int longest = 0;
    static int numLongest = 0;

    static int shortest = Integer.MAX_VALUE;
    static int numShortest = 0;

    public static int CountSymbols(String s) {
        return s.length();
    }

    public static void IsShortestLongest(String s, int count) {
        if (CountSymbols(s) > longest) {
            numLongest = count;
            longest = CountSymbols(s);
        }
        if (CountSymbols(s) < shortest) {
            numShortest = count;
            shortest = CountSymbols(s);
        }
    }

    public static void IsFinding(String s, String findWord, int count) {
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.equals(findWord)) {
                System.out.println("\"var\" is finding in line " + count + ":");
                System.out.println(s);
            }
        }
    }
}