package MyCollection.MyList;

import java.util.LinkedList;

public class MyLinkedList2 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(12);
        list.add(15);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(14);
        list2.add(15);
        list.addAll(list2);
        System.out.println(list);

        list2.retainAll(list);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        list.remove(new Integer(5)); // This Is Deprecated
        System.out.println(list);
        list.remove(Integer.valueOf(4));
        System.out.println(list);

        list.addFirst(5000);
        System.out.println(list);

        list.addFirst(10000);

        System.out.println(list);

//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println("After Peek Operation" + list);
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println("After Poll Operation" + list);

    }

}
