/**
 * Class Name : MemberSimple.java
 * Version Info : 0.0.1
 * Created Date : 2018-06-20
 * Last Modify Date : 2018-06-20
 * Copyright (c) : SPL
 * All right reserved
 **/

package com.spl.learntojava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MemberSimple {

    public static void numbering(int init, int limit) {
        int i = init;
        while( i < limit ) {
            System.out.println(i);
            i++;
        }
    }

    public static String numberingString(int init, int limit) {
        int i = init;
        String outputString = "";

        while( i < limit ) {
            System.out.println(i);

            outputString += i;
            i++;
        }

        return outputString;
    }

    public static void fileWriteString(String str) {

        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("stingOut.txt"));
            file.write(str);
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] argv) {
        //numbering(0, 10);

        String result = numberingString(0, 5);
        System.out.println(result);

        fileWriteString(result);
    }
}
