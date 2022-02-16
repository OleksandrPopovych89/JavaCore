/*
Homework task.
Task 1.

Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
realizing the operations of union and intersection of two sets.
Test the operation of these techniques on two pre-filled sets.
 */
package lesson9.homework.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        printSet("Set 1: ", set1);
        printSet("Set 2: ", set2);
        printSet("Union set: ", (union(set1, set2)));
        printSet("Intersect set: ", (intersect(set1, set2)));

    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectSet = new HashSet<>();
        for (Integer integer1 : set1) {
            for (Integer integer2 : set2) {
                if (integer1 == integer2) {
                    intersectSet.add(integer1);
                }
            }
        }
        return intersectSet;
    }

    private static void printSet(String str, Set<Integer> set) {
        System.out.println(str + set);
    }
}


