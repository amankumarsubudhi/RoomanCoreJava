package Inheritance;


class MyParent{
    public void write(){
        System.out.println("Parent is writing");
    }
}

class MyChild extends MyParent {
    public void read(){

    }
}

public class SingleLevel {
    public static void main(String[] args) {
        MyChild m = new MyChild();
        m.write();
    }
}
