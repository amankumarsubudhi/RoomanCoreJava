package MySetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Brahmapur");
        hs.add("Ganjam");
        hs.add("Odisha");
        hs.add("Odisha");
        hs.add(null);
        hs.add(null);
        hs.add("India");
        hs.add("Asia");
        System.out.println(hs);

        System.out.println("Using Iterator");
        Iterator <String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }

}
