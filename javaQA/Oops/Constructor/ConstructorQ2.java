
class Rectangle {

    private double length;
    private double width;

    public Rectangle(double len, double width) {
        this.length = len;
        this.width = width;
    }

    public Rectangle(Rectangle r) {
        this.length = r.length;
        this.width = r.width;
    }

    public void getInfo() {
        System.out.println("Rectangle Length : " + length);
        System.out.println("Rectangle Width : " + width);
    }
}

public class ConstructorQ2 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(12, 10);

        System.out.println("Rectagle r1 : ");
        r1.getInfo();

        Rectangle r2 = new Rectangle(r1);
        System.out.println("\nRectagle r2 : ");
        r2.getInfo();

    }
}
