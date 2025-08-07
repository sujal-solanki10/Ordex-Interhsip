public class Constants {
    
    public static final double PI = 3.14;

    public static double circleRadius(int r){
        return PI *r *r;
    }

    public static void main(String[] args) {
        int radius = 2;

        System.out.println("Circle Area is : "+circleRadius(radius));
    }

}
