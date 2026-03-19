package Test;

//It Occurs StackOverFlow

class m{
    public void mm(){
        mm();
    }
}

public class MyError {

    public static void main(String[] args) {
        m me = new m();
        me.mm();
    }

}
