
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> Alist = new ArrayList<>();

        //Add end
        Alist.add("Sujal");
        Alist.add("Hitansh");
        Alist.add("Sumit");

        //size
        Alist.size();
        System.out.println("Array List = :" + Alist);

        //remove th el
        Alist.remove(String.valueOf("Hitansh"));
        // remove .remove(index)
        // remove .remove(value)
        System.out.println("Array List Remove = :" + Alist);
        System.out.println("Array List size = :" + Alist.size());

        //loops
        System.out.println("Loops :");
        for (String var : Alist) {
            System.out.println(var);

        }
        System.out.println("Loops :");

        for (int i = 0; i < Alist.size(); i++) {
            System.out.println(Alist.get(i));

        }

        //Itreter
        Iterator<String> it = Alist.iterator();
        System.out.println();
        System.out.println("Interator Loops : ");
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        List<String> newList = new ArrayList<>();

        newList.add("1");
        newList.add("2");
        //addAll
        Alist.addAll(newList);
        System.out.println("Add All :" + Alist);

        //removeAll
        Alist.removeAll(newList);
        System.out.println("Remove Added All :" + Alist);

        // clear
        Alist.clear();
        System.out.println("Clear : " + Alist);

        //set
        Alist.add("Sujal");
        Alist.add("Hitansh");
        Alist.add(0, "Sumit");
        Alist.set(1, "sujal2");
        System.out.println(Alist);

        //check yes or no
        System.out.println("Contains : " + Alist.contains("sujal2"));
    }
}
