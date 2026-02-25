package Inheritance;

class MyParent1{
    public void write(){
        System.out.println("Parent is writing");
    }
}

class MyChild1 extends MyParent1 {
    public void read(){
        System.out.println("Child is reading");

    }
}

class Friend extends MyChild1{
    public void write(){
        System.out.println("Friend is playing");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        MyChild1 m = new MyChild1();
        m.write();
        Friend f = new Friend();
        f.write();
        f.read();
    }
}
