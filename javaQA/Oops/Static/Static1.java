
class counter {

    public static int count = 0;

    public counter() {
        count++;
    }

    public void getInfo() {
        System.out.println(count);
    }
}

public class Static1 {

    public static void main(String[] args) {

        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        c1.getInfo();
        
    }
}
