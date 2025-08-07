
class Animal {

    public void move() {
        System.out.println("\nAnimal Moving.");
    }
}

class Cheetah extends Animal {

    public void move() {
        System.out.println("\nCheetah run's Faster.");
    }
}

public class Main3 {

    public static void main(String[] args) {

        Cheetah cheetah = new Cheetah();
        cheetah.move();

        Animal animal = new Animal();
        animal.move();

    }
}
