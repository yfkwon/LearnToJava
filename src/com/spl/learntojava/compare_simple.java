/*
* Class Name : compareSimple.java
* Version Info : 0.0.1
* Created Date : 2018-06-19
* Last Modify Date : 2018-06-19
* Copyright (c) : SPL
* All right reserved
* */

package com.spl.learntojava;

public class compare_simple {
    public static void main(String [] argv) {

        System.out.println(1 == 2);
        System.out.println(1 == 1);

        System.out.println("one" == "two");
        System.out.println("one" == "one");

        String a = "Hello, World!!!";
        String b = new String("Hello, World!!!");
        System.out.println( a == b);
        System.out.println(a.equals(b));


    }
}
