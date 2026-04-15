package com.myMaps.www;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("FirstName", "Aman");
        lhm.put("MiddleName", "Kumar");
        lhm.put("LastName", "Subudhi");
        lhm.put("Age", "23");
        lhm.put("Gender", "Male");
        lhm.put("Email", "aman.work404@gmail.com");
        lhm.put("Password", "Aman@12345");

        System.out.println(lhm);
        System.out.println(lhm.get("FirstName"));
        System.out.println(lhm.get("MiddleName"));
        System.out.println(lhm.get("LastName"));
        System.out.println(lhm.get("Age"));
        System.out.println(lhm.get("Gender"));
        System.out.println(lhm.get("Email"));
        System.out.println(lhm.get("Password"));

        Set<String> keys = lhm.keySet();
        for (String k : keys) {
            System.out.println(k);
        }

        System.out.println(" ");

        System.out.println(" ");

        Collection<String> values = lhm.values();
        for (String v : values) {
            System.out.println(v);
        }

        Set<Map.Entry<String, String>> entrySet = lhm.entrySet();
        for (Map.Entry<String, String> es : entrySet) {
            System.out.println(es);
        }

    }

}
