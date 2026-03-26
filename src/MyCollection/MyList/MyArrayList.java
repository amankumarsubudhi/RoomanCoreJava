package MyCollection.MyList;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {

    public static void main(String[] args) {
        /*
       Arraylist Backed By Array.

       ArrayList Maintains Insertion Order (Insertion Order Is Preserved).

       ArrayList Is Dynamic.

       ArrayList Can Grow And Shrink.

       ArrayList Can Store Heterogeneous Type of Data.

       ArrayList Allow Null Value.

       Arraylist Allows Duplicate.


*/
        ArrayList al = new ArrayList();

        // Primitive Datatype Automatically Converted Into Wrapper Class Is Known As Auto Boxing.
        al.add(1); //a1.add(new Integer(10));
        al.add(2);
        al.add(3);

        System.out.println(al);

        al.add(4);
        al.add(5);
        al.add(5);
        System.out.println(al);

        al.add("Rooman");
        al.add(null);
        al.add("Rooman");
        al.add(null);
        al.add("Bengaluru");
        System.out.println(al);
        System.out.println(" ");

        System.out.println("Iterating Using 'for Loop' ");


        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Iterating Over List Using foreach");

        for(Object o : al){
            System.out.println(o);
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Using Iterator");

        Iterator itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
