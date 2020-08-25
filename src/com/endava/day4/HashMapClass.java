package com.endava.day4;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void myHashMap(){

        Map<String, Integer> score = new HashMap<>();

        score.put("OFK", 60);
        score.put("PFK", 45);
        score.put("FKCZ", 52);

        System.out.println(score);// sortira po hashu


        System.out.println(score.get("PFK"));// cita njegovu vrednost za zadati kljuc
    }
}
