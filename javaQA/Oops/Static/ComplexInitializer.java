public class ComplexInitializer {
    public static int x;
    public static int y;
    public static int z;

    static {
        x = 1;
        y = 2;
        z = calculateZ(x, y);
    }
    public static int calculateZ(int a, int b){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }

}
