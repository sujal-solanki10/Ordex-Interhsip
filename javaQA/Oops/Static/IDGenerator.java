
public class IDGenerator {

    public static int nextId = 0;

    public static int generateId() {
        // nextId++;
        return ++nextId;
    }

    public static void main(String[] args) {
        System.out.println("New Id is : " + IDGenerator.generateId());
        System.out.println("New Id is : " + IDGenerator.generateId());
        System.out.println("New Id is : " + IDGenerator.generateId());
        System.out.println("New Id is : " + IDGenerator.generateId());
    }
}
