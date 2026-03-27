package MyCollection.MyList;

import java.util.LinkedList;

public class MyLinkedList3 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.getFirst()); // It Throws An Exception If The List Is Empty
        System.out.println(list.peekFirst()); // It Returns Null If The List Is Empty

    }

}
