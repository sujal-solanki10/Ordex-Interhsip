
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        LinkedList<String> l_List = new LinkedList<>();
        l_List.add("sujal");
        l_List.add("Nabin");
        l_List.add("sumit");
        l_List.add("krishna");
        l_List.add("Hitansh");
        l_List.add("Meet");
        System.out.println(l_List);

        System.out.println("\nIterate : ");
        for (String i : l_List) {
            System.err.println(i);
        }
        System.out.println("\n  Using Interator : ");
        Iterator p = l_List.listIterator(1);

        while (p.hasNext()) {
            System.out.println(p.next());

        }

        System.out.println("\nreverse : ");
        Iterator it = l_List.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nAdd Element : ");
        l_List.add(1, "Name");
        System.out.println(l_List);

        System.out.println("\nAdd First : ");
        l_List.addFirst("FirstName");
        //offerFirst
        System.out.println(l_List);

        System.out.println("\nAdd Last : ");
        l_List.addLast("LastName");
        //offerLast
        System.out.println(l_List);

        //get first el
        System.out.println("First El : " + l_List.getFirst());

        //get Last el
        System.out.println("First El : " + l_List.getLast());

        System.out.println();

        //remove 
        System.out.println(l_List);
        System.out.print("remove : Nabin : ->");
        l_List.remove("Nabin");//index 
        System.out.print(l_List);

        //remove all
        System.out.print("\n\nRemove all : ");
        // l_List.clear();
        System.out.print("\n"+l_List);

        //swap
        System.out.println(l_List);
        System.out.println("Swap 2 and 0");
        Collections.swap(l_List, 2, 0);

        //shuffle

        System.out.println("shuffle : ");
        Collections.shuffle(l_List);
        System.out.println(l_List);


        LinkedList<String> a = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        list2.add("new");
        list2.add("List");
        list2.add("add");

        a.addAll(l_List);
        a.addAll(list2);
        System.out.println("Two List Added  : "+a);
    }
}
