package ArrayQueue;

import java.util.Queue;
import java.util.Stack;
//import java.util.LinkedList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_QWTS {
    public static void main(String[] args) {
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        var front = queue.dequeue();
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        queue.enqueue(70);
//        System.out.println(front);
//        System.out.println(queue);

        QueueWithTwoStacks queue1 = new QueueWithTwoStacks();
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        var first = queue1.dequeue();
        System.out.println(first);
        System.out.println(queue1);

    }

    public static void reverse(Queue<Integer> queue) {
        //add
        //remove
        //isEmpty
        // Q[10, 20, 30]
        Stack<Integer> temp = new Stack<>();
        while (!queue.isEmpty()) {
            temp.push(queue.remove());
        }
        while (!temp.isEmpty()) {
            queue.add(temp.pop());
        }
    }
}
