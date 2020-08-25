package com.endava.day4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

    public static void myArrayList(){
        // mozemo da koristimo i ArrayList umesto List, ali bolje korestiti instancu od interfejsa u ovom slucaju List
        // Lista ima sve osnovne funkcionalnosti

        List<String> list = new ArrayList<>(10);// mozemo dodati kpacitet liste ali je opcionalno
        System.out.println(list);// stampa praznu listu jer jos nista nismo dodali
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("EE");
        list.add("AA");
        System.out.println(list);

//        //elemente mozemo getovati pomocu indeksa
//        String element = list.get(1);
//        System.out.println(element);
//        // mozemo sa for-each da odstampamo sve elemente deklarisemo neki string
//        for(String elementi : list){
//            System.out.println(elementi);
//        }

        //mozemo obrisati elemente
        list.remove("AA");
        list.remove("CC");
        System.out.println(list);
//
        // mozemo da addujemo u sred niza shiftovanjem ostalih ili riplejsovanjem
        list.add(2, "TWO");
        System.out.println(list);//umetne element

        list.set(2, "TEN");
        System.out.println(list);//zameni element na tom mestu

    }
}
