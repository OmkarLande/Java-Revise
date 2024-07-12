package CollectionFramework;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        System.out.println("Elements in the Queue: " + queue);
        //offer is similar with add but add throws an exception if the element cannot be added

        // Remove the head of the Queue
        System.out.println("Head of the Queue: " + queue.poll());
        // poll is similar with remove but remove throws an exception if the element cannot be removed
        System.out.println("Elements in the Queue: " + queue);

        // Display the head of the Queue
        System.out.println("Head of the Queue: " + queue.peek());
        // peek is similar with element but element throws an exception if the element cannot be peeked

        // to delete particular element
        queue.remove("D");
        System.out.println("Elements in the Queue: " + queue);

        // Display contents of the Queue
        System.out.println("Elements in the Queue: " + queue);


        // to loop in LinkedList
        for (String name : queue) {
            System.out.println(name);
        }
        // to take input in LinkedList
        for (int i = 0; i < queue.size(); i++) {
            String name = scanner.nextLine();
            queue.offer(name);
        }

        // to delete all elements
        queue.clear();
        System.out.println("Elements in the Queue: " + queue);
    }
}
