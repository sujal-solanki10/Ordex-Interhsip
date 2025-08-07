
import java.util.*;

public class Stack1 {

    public static void main(String[] args) {

        Stack<String> animal = new Stack<>();

        animal.push("Dog");
        animal.push("cat");
        animal.push("Lion");

        // animal.pop();
        System.out.println(animal);
        System.out.println("Pop the elemnt : " + animal.pop());

        //Peek
        System.out.println("Peek: " + animal.peek());

        System.out.println(animal);
        // String ch = " ";cls
        // Scanner sc = new Scanner(System.in);

        // while (!ch.equals("q")) {
        //     System.out.print("Enter the choise :  ");
        //     ch = sc.nextLine();
        //     System.out.println(ch);
        //     if(ch.equals("a")) {
        //         System.out.print("Enter the Element : ");
        //         String el = sc.nextLine();
        //         animal.push(el);
        //     }
        //     else if (ch.equals("p")) {
        //         System.out.println("Poped this elemt : " + animal.pop());
        //     }
        //     else{
        //     }
        // }
    }
}
