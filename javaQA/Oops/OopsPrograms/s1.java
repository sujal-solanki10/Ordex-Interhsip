
import java.util.Random;

public class s1 {

    public static void main(String[] args) {
        // Random rand = new Random();

        // int i = 1;
        // while (i <= 4) {
        //     int a = rand.nextInt(1, 5);
        //     if (a == i) {
        //         System.out.println(a);
        //         i++;
        //     }
        // }
        System.out.println(fibo(77));

    }

    public static int fibo(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
