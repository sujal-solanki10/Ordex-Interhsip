public class Initializer {

    static int initialValue;

    static {
        initialValue = 2000;
        System.out.println("Static block: initialValue initialized to " + initialValue);
    }

    public static void main(String[] args) {
        System.out.println("Before : "+Initializer.initialValue);

        Initializer n1 = new Initializer();

        System.err.println("After : "+Initializer.initialValue);
    }
    
}
