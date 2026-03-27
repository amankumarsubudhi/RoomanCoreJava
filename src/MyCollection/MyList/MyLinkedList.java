package MyCollection.MyList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.println("Print Using Enhanced For Loop");
        for(Integer i : list){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Using Iterator");
        System.out.println(" ");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Using List Iterator");
        System.out.println(" ");
        ListIterator <Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }

}
