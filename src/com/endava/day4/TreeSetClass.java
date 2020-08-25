package com.endava.day4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

    public static void myTreeSet() {
        Set<Integer> lotteryNum = new TreeSet<>();

        lotteryNum.add(3);
        lotteryNum.add(30);
        lotteryNum.add(13);
        lotteryNum.add(23);
        lotteryNum.add(33);
        lotteryNum.add(4);
        lotteryNum.add(39);
        lotteryNum.add(3);// nema ponavljanja

        System.out.println(lotteryNum);// sortiran je rastuce

    }
}
