
import java.util.ArrayDeque;

public class ArrayDequeue {
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer> dQueue = new ArrayDeque<>();

        dQueue.offer(12);
        dQueue.offerFirst(23);
        dQueue.offerLast(3);

        System.out.println(dQueue);
        
    }
}
