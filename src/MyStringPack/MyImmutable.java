package MyStringPack;

public class MyImmutable {

    public static void main(String[] args) {
        String s = "Rooman";
        System.out.println(s);
        System.out.println(s.concat(" Technologies"));
        System.out.println(s);

        StringBuffer s2 = new StringBuffer(s);
        System.out.println(s2);
        s2.append("Technologies");
        s = s2.toString();
        System.out.println(s);

    }


}
