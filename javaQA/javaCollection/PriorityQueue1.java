
import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(12);
        queue.add(9);
        queue.add(2);

        queue.poll();

        queue.peek();
        System.out.println(queue);

        Queue<Integer> rewQueue = new PriorityQueue<>(Comparator.reverseOrder());

        rewQueue.add(35);
        rewQueue.add(45);
        rewQueue.add(30);
        rewQueue.add(34);

        rewQueue.poll();
        System.out.println(rewQueue);

    }
}
