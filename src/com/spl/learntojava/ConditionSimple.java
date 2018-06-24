/*
 * Class Name : ConditionSimple.java
 * Version Info : 0.0.1
 * Created Date : 2018-06-19
 * Last Modify Date : 2018-06-19
 * Copyright (c) : SPL
 * All right reserved
 * */

package com.spl.learntojava;

/**
 *
 */
public class ConditionSimple {
    /**
     *
     * @param argv
     */
    public static void main(String [] args) {

        if(true) {
            System.out.println("result : true");
        }

        if(true)
            System.out.println(1);
        else
            System.out.println(2);

        String id = args[0];
        String password = args[1];

        if(id.equals("egoing")) {
            System.out.println("Yes");

            if (password.equals("1111"))
                System.out.println("Password is matched");
            else
                System.out.println("Password is not matched");
        }
        else
            System.out.println("No");



    }
}
