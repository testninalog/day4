package com.endava.day4;

import java.sql.SQLOutput;

public class ExceptionClass {

    public static void myExceptions() {//throws InterruptedException ovaj deo smo dodali sa Alt + Enter na sleep

        mathDivide(5,0);//4.metoda koja deli, za koju cekujemp da zbog deljenja 0 baci exception
        try {// ili mozemo na drugi nacin suurandet catch/trow na ALT+Enter
            // ako u sleep stavim negativan broj imacemo exception
            Thread.sleep(100);//koliko zelimo da cekmo
            //ako menjamo argument 4 dobicemo razlicite rez
            newExceptions(4);//3. dodamo i add a catch closed alt+enter
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());//3.dodamo
        }


//        try {
//            newExceptions(2);// 2. dodamo 2 u zagradu alt + enter i dodacemo try catch blok
//        } catch (Exception e) {
////            e.printStackTrace();
//            System.out.println(e.getMessage());// 2.dopisemo ovo
//        }


    }
    static double mathDivide(Integer a, Integer b){
        double c = 0;
        try{
            c = a/b;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return a/b;
    }
    static void newExceptions(Integer num) throws Exception {// 2.dodamo naknadno ovaj Integer

        if (num % 2 == 0) {
            throw new Exception("Exception Mesagge - even number");// add method signature na alt+enter
        } else
            throw new Exception("This is not an even number - exception"); //else je ovde samo radi pokaznog primera
        //inace else necemo stavljati
    }
}
