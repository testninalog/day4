package com.endava.day4;

import java.util.LinkedList;

public class LinkedListClass {
    public static void myLinkedList(){

        LinkedList<String> llist = new LinkedList<>();//indeksi idu kao i niz u istom smeru
        llist.push("AA");
        llist.push("BB");
        llist.push("CC");
        llist.push("CD");
        llist.push("EC");
        System.out.println(llist);//upisuje ih u suprotnom redosledu, tj gura ih na kraj, tj stavlja nove na pocetak - kao tanjiri - ipak mozes uzeti cetvrti :) LIFO

//        String element = llist.get(2);
//        String element1 = llist.getFirst();// prvi je poslednji koji je upisan
//        String element2 = llist.getLast(); // poslednji je prvi koji je upisan
//        System.out.println(element);
//        System.out.println(element1);
//        System.out.println(element2);

        llist.pop();// skida sa vrha poslednji koji je addovan
        System.out.println(llist);
//
//        llist.remove(2);
//        System.out.println(llist);

        llist.set(1,"new");
        System.out.println(llist);

    }
}
