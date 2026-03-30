package MySetInterface;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    String name;
    int id;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);     // Sorted Using Name
//      return Integer.compare(this.id, o.id);  // Sorted Using ID
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.id, o2.id);
    }
}



public class MyTreeHashSet {

    public static void main(String[] args) {

        AgeComparator ageComparator = new AgeComparator();

        TreeSet<Employee> treeSet = new TreeSet<Employee>(ageComparator);

        treeSet.add(new Employee(21,"Nabina"));
        treeSet.add(new Employee(59,"Aman"));
        treeSet.add(new Employee(54,"Chinmaya"));
        treeSet.add(new Employee(05,"Bishnu"));
        treeSet.add(new Employee(58,"Omm"));

        System.out.println(treeSet);


        System.out.println("TreeSet Sorting Based On Age");

    }

}
