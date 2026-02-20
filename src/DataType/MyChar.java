package DataType;

public class MyChar {

    public static void main(String[] args) {

        System.out.println("");
        for (int i=65;i<=90;i++){
            System.out.print((char) i);
            System.out.print(",");
        }
        System.out.println("");

        for (int i=97;i<=122;i++){
            System.out.print((char) i);
            System.out.print(",");
        }
        System.out.println("");

        for (int i='\u0B00';i<='\u0B7F';i++){
            System.out.print((char) i);
            System.out.print(",");

        }


    }


}
