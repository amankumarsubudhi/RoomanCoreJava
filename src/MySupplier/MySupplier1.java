package MySupplier;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.function.Supplier;

public class MySupplier1 {
    public static void main(String[] args) {

        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
