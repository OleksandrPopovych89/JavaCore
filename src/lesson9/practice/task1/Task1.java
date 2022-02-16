/*
Practical task.
Task 1.

Declare collection myCollection of 10 integers and fill it (from the console or random).
- Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
- Remove from collection myCollection elements, which are greater than 20. Print result
- Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
- Sort and print collection.
Use one or more of the next Collections: List, ArrayList, LinkedList.
 */
package lesson9.practice.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws IOException {

        List<Integer> myCollection = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + i + " number: ");
            myCollection.add(Integer.parseInt(bufferedReader.readLine()));
        }
        System.out.println(myCollection);

        List<Integer> newCollection = new LinkedList<>();

        Iterator<Integer> iterator = myCollection.listIterator();
        int count = -1;
        while (iterator.hasNext()) {
            count++;
            if (iterator.next() > 5) {
                newCollection.add(iterator.next());
            }
        }
        System.out.println(newCollection);

        for (int i = 9; i >= 0; i--) {
            if (myCollection.get(i) > 20)
                myCollection.remove(i);
        }
        System.out.println(myCollection);
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }
        System.out.println(myCollection);

        myCollection.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(myCollection);
    }
}