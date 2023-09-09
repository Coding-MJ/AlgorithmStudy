import ArrayQueue.ArrayQueue;
import LinkedList.LinkedList;

import java.util.*;
//import java.util.LinkedList;
import ArrayQueue.QueueWithTwoStacks;
import ArrayQueue.PriorityQueue;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        System.out.println(queue);

        while (!queue.isEmpty())
            System.out.println(queue.remove());

    }
}
