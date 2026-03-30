package MySetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class St implements Comparable<St>{
    String name;

    public String getName() {
        return name;
    }

    public St(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "St{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(St o) {
//        return this.getName().compareTo(o.getName()); // It Returns Alphabetically.
        return -this.getName().compareTo(o.getName());  // It Returns Reverse Of Alphabetically.
    }
}

public class MyHashSet2 {

    public static void main(String[] args) {

        HashSet<St> hsl = new HashSet<St>();
        hsl.add(new St("Aks 1"));
        hsl.add(new St("Aks 2"));
        hsl.add(new St("Aks 3"));
        hsl.add(new St("Aks 4"));
        hsl.add(new St("Aks 2"));

        System.out.println(hsl);

        LinkedHashSet<St> lhs = new LinkedHashSet<St>();
        lhs.add(new St("Aks 5"));
        lhs.add(new St("Aks 6"));
        lhs.add(new St("Aks 7"));
        lhs.add(new St("Aks 8"));
        lhs.add(new St("Aks 8"));

        System.out.println(lhs);


        TreeSet<St> ths = new TreeSet<>();
        ths.add(new St("Aks 10"));
        ths.add(new St("Aks 12"));
        ths.add(new St("Aks 14"));
        ths.add(new St("Aks 16"));
        ths.add(new St("Aks 18"));

        System.out.println(ths);


    }

}
