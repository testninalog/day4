package com.endava.day4;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

    public static void myHashSet () {

        Set <String> set = new HashSet<>();

        set.add("Ana");
        set.add("Milica");
        set.add("Goran");
        set.add("Kristina");
        set.add("Slavica");
        System.out.println(set);

        set.add("Ana");
        System.out.println(set.add("Ana"));// vraca true or false u slucaju da je dodavanje proslo ili ne
//
        set.remove("Goran");//brise
        System.out.println(set);

//        Boolean contains = set.contains("Milica");// da li element postoji
//        System.out.println(contains);

        Boolean contains = set.contains("Goran");// da li element postoji
        System.out.println(contains);
//        String a = "Ana";
//        String b = "Milica";
//        String c = "Slavica";// ako probamo da dodamo istu vrednost nece moci
//
//        System.out.println(a +":"+ a.hashCode());// svaka vrednost u setu ima svoj hash kod
//        System.out.println("index:"+a.hashCode()%16);//indeksi pokazuju da nema reda
//
//        System.out.println(b +":"+ b.hashCode());
//        System.out.println("index:"+b.hashCode()%16);
//
//        System.out.println(c +":"+ c.hashCode());
//        System.out.println("index:"+c.hashCode()%16);

    }
}
