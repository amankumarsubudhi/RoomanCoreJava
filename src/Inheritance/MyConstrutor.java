package Inheritance;


class Alpha{
    public Alpha(){

        //Error - (java: recursive constructor invocation) due to this method again calling this method due to parameter
        //this();
        System.out.println("Alpha");
    }
}



public class MyConstrutor {

    public static void main(String[] args) {
        Alpha alpha = new Alpha();
    }

}
