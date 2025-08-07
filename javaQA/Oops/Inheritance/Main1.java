class Shape{
    public double getArea(){
       return 0.0;
    }

}

class Rectangle extends  Shape{
    private double width;
    private double length;

    public Rectangle(double width, double lenght){
        this.width = width;
        this.length = lenght;
    }
    @Override
    public double getArea(){
        return width * length;
    }
}

public class Main1{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12,2);

        System.out.println("Area of Rectangle : "+r1.getArea()) ;
        
    }
}