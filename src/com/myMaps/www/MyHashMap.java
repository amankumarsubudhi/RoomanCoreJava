package com.myMaps.www;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {

    public static void main(String[] args) {

        HashMap<String, String> hs = new HashMap<>();
        hs.put("FirstName", "Aman");
        hs.put("MiddleName", "Kumar");
        hs.put("LastName", "Subudhi");
        hs.put("Age", "23");
        hs.put("Gender", "Male");
        hs.put("Email", "aman.work404@gmail.com");
        hs.put("Password", "Aman@12345");
        System.out.println(hs);
        System.out.println(hs.get("FirstName"));
        System.out.println(hs.get("MiddleName"));
        System.out.println(hs.get("LastName"));
        System.out.println(hs.get("Age"));
        System.out.println(hs.get("Gender"));
        System.out.println(hs.get("Email"));
        System.out.println(hs.get("Password"));


        Set<String> keys = hs.keySet();
        for (String k : keys) {
            System.out.println(k);
        }

        System.out.println(" ");
        System.out.println(" ");

        Collection<String> values = hs.values();
        for (String v : values) {
            System.out.println(v);
        }



//        Set<Map.Entry<String, String>> entrySet = hs.entrySet();
          Set<Map.Entry<String, String>> entrySet = hs.entrySet();

        for (Map.Entry<String, String> es : entrySet) {
            System.out.println(es);
        }



    }

}
