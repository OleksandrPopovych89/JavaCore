/**
 * Practical task.
 * Task 1:
 * <p>
 * 1. Print n random numbers on console using Java 8.
 * 2. Print n random numbers on console using Java 8 in a sorted order.
 * 3. Using Java 8 show the biggest number from n random numbers.
 * 4. Show which today is a day of a week.
 * 5. Show a date of first Monday for current month.
 * 6. Write a method for sorting list of Strings using Java 8.
 */

package lesson13.practice.tasks;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        Random random = new Random();

        random.ints(5, 1, 100).forEach(System.out::println);

        System.out.println("--------Task1---------");
        random.ints(5, 1, 100).sorted().forEach(System.out::println);

        System.out.println("--------Task2---------");
        List<Integer> list1 = random.ints(5, 0, 100)
                .boxed().toList();

        list1.forEach(System.out::println);

        System.out.println("--------Task3---------");
        IntSummaryStatistics statistics = list1.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Maximum " + statistics.getMax());


        System.out.println("--------Task4---------");
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println(time1.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));
        //https://nsdateformatter.com/

        System.out.println("--------Task5---------");
        LocalDateTime time2 = time1.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY));
        System.out.println(time2.format(DateTimeFormatter.ofPattern("E dd.MM.yyyy")));

        System.out.println("--------Task6---------");
        List<String> list2 = Arrays.asList("Ivan", "Heorhyi", "Anton", "Stanislav");
        Collections.sort(list2);
        System.out.println(list2);
    }
}
