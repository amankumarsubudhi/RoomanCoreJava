package MyCollection.MyList;

import java.util.LinkedList;

public class MyLinkedList4 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.add(4000);
        list.add(5000);
        list.add(6000);
        list.add(7000);
        list.add(8000);


        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            list.remove(Integer.valueOf(4000));
        }

    }

}
