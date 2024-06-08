package CollectionFramework;
import java.util.LinkedList;
import java.util.Queue;
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        //offer is similar with add but add throws an exception if the element cannot be added

        // Remove the head of the Queue
        System.out.println("Head of the Queue: " + queue.poll());
        // poll is similar with remove but remove throws an exception if the element cannot be removed

        // Display the head of the Queue
        System.out.println("Head of the Queue: " + queue.peek());
        // peek is similar with element but element throws an exception if the element cannot be peeked


        // Display contents of the Queue
        System.out.println("Elements in the Queue: " + queue);


    }
}
