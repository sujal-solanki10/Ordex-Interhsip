class cat{

    int age;
    String name;
    cat(){
        this.age = 0;
        this.name = "none";
    }

    public int geAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}

public class defultConstructor{
    public static void main(String[] args) {
        cat c = new cat();

        System.out.println(c.geAge());
        System.out.println(c.getName());
        
    }
}