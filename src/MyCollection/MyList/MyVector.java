package MyCollection.MyList;

import java.util.Enumeration;
import java.util.Vector;

public class MyVector {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(100);
        v.add(200);
        v.add(100);
        v.add(400);
        v.add(500);
        v.add(null);
        v.add(null);
        System.out.println(v);

        System.out.println("Using Enumerator");

        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }


    }

}
