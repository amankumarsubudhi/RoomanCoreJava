package MyStringPack;

public class MyString8 {

    public static void main(String[] args) {
        String s1 = "Odisha is a beautiful state";

        String[] sh = s1.split(" ");
        for(String c : sh){
            System.out.println(c);
        }
        String s2 = "Odisha is-a-beautiful state";
        String[] si = s2.split(" ");
        for(String b : si){
            System.out.println(b);
        }

        String s3 = "Brahmapur-is a-beautiful-city";
        String[] sd = s3.split("-");
        for(String d : sd){
            System.out.println(d);
        }

    }


}
