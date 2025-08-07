
class Car {

    private String model;
    private String make;
    private int year;

    Car(String model, String make, int year) {

        this.model = (model == null || model.isEmpty()) ? "Unknown Name" : model;

        this.make = (make == null || make.isEmpty()) ? "Unknown Make" : make;

        this.year = (year <= 0) ? 2000 : year;
    }

    public void getInfo() {
        System.out.println("Car 2 Make: " + make);
        System.out.println("Car 2 Model: " + model);
        System.out.println("Car 2 Year: " + year);
    }
}

public class ConstructorQ4 {

    public static void main(String[] args) {

        // String s1 = "";
        // String s2 = null;
        // System.out.println(s1.isEmpty());
        // System.out.println(s2 == null);
        Car c1 = new Car("Nexon", "TATA", 2015);
        System.out.println("\n");
        c1.getInfo();
        Car c2 = new Car("", "", 2);
        System.out.println("\n");
        c2.getInfo();
        Car c3 = new Car("Nexon", "TATA", -1);
        System.out.println("\n");
        c3.getInfo();
    }
}
