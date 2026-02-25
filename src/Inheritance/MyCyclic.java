package Inheritance;

// Java Doesn't Support Cyclic Inheritance

class MyParents extends MyChilds{

}

class MyChilds extends MyParents{

}

public class MyCyclic {

    public static void main(String[] args) {

    }

}
