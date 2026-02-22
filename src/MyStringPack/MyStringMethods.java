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

        String a = "ODISHA";
        System.out.println(a.charAt(3));
        System.out.println(a.indexOf('I'));
        System.out.println(a.indexOf('N'));

        System.out.println(s2.indexOf('O'));
        System.out.println(s2.lastIndexOf('O'));

        String s6 ="rOOmAn";
        String s7 = s6.toLowerCase();

        System.out.println(s6.equals(s7));
        System.out.println(s6 == s7);
    }


}
