package MyCollection.MyList;

import java.util.LinkedList;

public class MyLinkedList5 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.push(1000);
        list.push(2000);
        list.push(3000);
        list.push(4000);
        list.push(5000);

        System.out.println(list.pop());
        System.out.println(list);
        int n =  list.size()-1;
        while(n>=0){
            System.out.println(list.pop());
            n--;
        }

    }

}
