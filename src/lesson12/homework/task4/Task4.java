/**
Homework task.
Task 4:

Create file1.txt file with a text about your career.
Read context from file into array of strings.
Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date.
 */

package lesson12.homework.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        String readFileName = "src/lesson12/homework/task4/file1.txt";
        String writeFileName = "src/lesson12/homework/task4/file2.txt";
        String str;
        int countLines = 0;
        List<String> lines = new ArrayList<>();

        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader(readFileName);
            bufferedReader = new BufferedReader(fileReader);

            while ((str = bufferedReader.readLine()) != null) {
                lines.add(str);
                countLines++;
                isLongest(str, countLines);
            }
            System.out.println("Final longest " + longest);
            System.out.println("Final count lines " + countLines);

            fileWriter = new FileWriter(writeFileName, false);

            fileWriter.write("Text has " + countLines + " lines.");
            fileWriter.append("\n");

            fileWriter.write("Longest line has " + longest + " symbol.");
            fileWriter.append("\n");

            fileWriter.write("Longest line is: \n" + lines.get(longestNumber - 1));
            fileWriter.append("\n");

            fileWriter.write("Popovych Oleksandr 11.09.1989");//Name and birthday

            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int longest = 0;
    static int longestNumber = 0;

    public static void isLongest(String str, int countLines) {
        if (str.length() > longest) {
            longest = str.length();
            System.out.println("Longest " + longest);
            longestNumber = countLines;
            System.out.println(longestNumber);
        }
    }
}