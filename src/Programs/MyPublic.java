package Programs;


class MyChar{
    public static void mycharPrint(){
        String t="";
        for (char i=65;i<=75;i++){
            t = t+i;
        }
        System.out.println(t);
        System.out.println(t.getClass());
    }
}



public class MyPublic {

    public static void main(String[] args) {
        MyChar myChar1 = new MyChar();
        myChar1.mycharPrint();
    }

}
