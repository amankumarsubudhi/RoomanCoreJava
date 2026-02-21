package MyStringPack;

public class MyStringMethods {

    public static void main(String[] args) {
        String s1 = "Rooman";
        String s2 = "ROOMAN";
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        String s3 = s2.toLowerCase();
        String s4 = "rooman";
        System.out.println(s2);
        System.out.println(s3 == s4);
        String s5 = s2.toLowerCase();
        System.out.println(s3 == s5);
    }


}
