
abstract  class Animal{

    public abstract  void eat();
    public abstract  void sleep();
}




class Lion extends Animal{
    
    public void eat(){
        System.out.println("Lion eats meat.");

    }
    public void sleep(){
        System.out.println("Lion sleeps on grassland.");

    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger eats meat and occasionally hunts in water.");

    }
    public void sleep(){
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}
class Deer extends Animal{
    public void eat(){
        System.out.println("Deer grazes on grass and leaves.");

    }
    public void sleep(){
        System.out.println("Deer sleeps in open fields.");

    }
}
public class Main1 {
    public static void main(String[] args) {

        Lion lion = new Lion();

        lion.eat();
        lion.sleep();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        Deer deer =  new Deer();
        deer.eat();
        deer.sleep();
        
    }
}
