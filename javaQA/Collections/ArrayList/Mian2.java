
import java.util.*;

public class Mian2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("orange");
        list.add("black");

        System.out.println(list);

        for (String color : list) {
            System.out.println(color);
        }

        //insert At first
        list.add(0, "sujal");

        System.out.println("\nNew At 0 index : " + list.get(0));

        //inser at last
        list.add(list.size(), "Nabin");
        System.out.println(list);

        //Retrieve Element by Index
        System.out.println("\nElement at index 2 : " + list.get(2));
        System.out.println("Element at index 3 : " + list.get(3));
        System.out.println("Element at index 0 : " + list.get(0));

        //update array list
        list.set(3, "Updates");
        System.out.println("\nUpdated list : " + list);

        //remove 3rd elemnt
        list.remove(2);
        System.out.println("\nremove 3rd element : " + list);

        //rearch
        if (list.contains("sujal")) {
            System.out.println("\nYes ,sujal in list.");
        } else {
            System.out.println("No ,sujal is Notx list.");
        }

        //sorting the list
        Collections.sort(list);

        System.out.println("\nsorted List : " + list);

        List<String> list2 = new ArrayList<>(Collections.nCopies(list.size() + 1, ""));

        // list.remove(4?);
        list2.add("12");
        System.out.println(list2);
        Collections.copy(list2, list);
        System.out.println(list2);

        //suffle list
        Collections.shuffle(list);
        System.out.println("\nShuffle : " + list);

        //reverse
        Collections.reverse(list);

        System.out.println("\nReverse list : " + list);

        //sub list
        List<String> subList = list.subList(0, 2);

        System.out.println("\nSub List : " + subList);

        //comparing
        System.out.println(subList == subList);

        System.out.println("Comparing list : ");
        for (String a : list) {
            System.out.println(subList.contains(a) ? "yes" : "No");
        }

        //swap
        System.out.println(list);
        Collections.swap(list, 0, 2);
        System.out.println("Swap 0 and 2 : " + list);

        List<String> a = new ArrayList<>();

        a.addAll(list);
        a.addAll(list2);

        System.out.println("Two String Added : "+a);

        //clone
        

    }
}
