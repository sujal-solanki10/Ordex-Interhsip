
class Dog {
    
    private String name;
    private String color;

    Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }
}

class ParaConstructor{
    public static void main(String[] args) {
        Dog D = new Dog("Sheru","white");

        System.out.println("Dog's Name is "+D.getName());
        System.out.println("Dog's COlor is "+D.getColor());
    }
}
