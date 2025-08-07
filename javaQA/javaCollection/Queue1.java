
import java.util.LinkedList;
import java.util.Queue;

class Queue1 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //add if note add execepsion
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        //remove if note remove exp
        queue.poll();
        System.out.println(queue);

        //element

        System.out.println(queue.peek());


    }
}
