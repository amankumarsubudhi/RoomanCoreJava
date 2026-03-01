package Programs;


class MyPrint{

    public  static void prints(){
        System.out.println("Printing Alphabet Uppercase");
        System.out.println("Uppercase To Lowercase");
        for(int i=65;i<=90;i++){
            System.out.print((char)(i+32)+",");
        }
        System.out.println(" ");
        System.out.println("Lowercase To Uppercase");
        for(int i=97;i<=122;i++){
            System.out.print((char)(i-32)+",");
        }
    }

}


public class MyPro {

    public static void main(String[] args) {
        MyPrint myPrint = new MyPrint();
        myPrint.prints();
    }

}
