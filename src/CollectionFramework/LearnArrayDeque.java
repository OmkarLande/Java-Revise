package CollectionFramework;
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(45);
        adq.offerLast(67);
        adq.offer(89);

        System.out.println(adq);

        System.out.println("normal peek"+adq.peek());
        System.out.println("peek first"+adq.peekFirst());
        System.out.println("peek last"+adq.peekLast());

        System.out.println("normal poll"+adq.poll());
        System.out.println("poll first"+adq.pollFirst());
        System.out.println("poll last"+adq.pollLast());

        System.out.println(adq);


    }
}
