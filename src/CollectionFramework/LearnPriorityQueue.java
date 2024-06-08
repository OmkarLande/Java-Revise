package CollectionFramework;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(7);
        pq.offer(15);

        //it displays using min heap using heapify
        System.out.println(pq);

        pq.peek();
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        //comparator

        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(12);
        pq1.offer(7);
        pq1.offer(15);

        System.out.println(pq1);

        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        pq2.offer(12);
        pq2.offer(7);
        pq2.offer(15);

        System.out.println(pq2);



    }
}
