package MyCollection.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList2 {

    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();

        s.add("Brahmapur");
        s.add("Ganjam");
        s.add("Odisha");
        s.add("India");
        s.add("Asia");

        System.out.println(" ");
        System.out.println("Using Enhanced For Loop");
        System.out.println(" ");
        for (String s1 : s) {
            System.out.println(s1);
        }

        Iterator<String> iterator = s.iterator();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Using Iterator");
        System.out.println(" ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = s.listIterator(s.size());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" Using ListIterator");
        System.out.println(" ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

}
