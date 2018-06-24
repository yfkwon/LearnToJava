/*
 * Class Name : InputSimple.java
 * Version Info : 0.0.1
 * Created Date : 2018-06-19
 * Last Modify Date : 2018-06-19
 * Copyright (c) : SPL
 * All right reserved
 * */

package com.spl.learntojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSimple {
    public static void main(String [] argv) throws IOException {

        byte [] inputBuffer = new byte[100];
        System.out.print("Input String:");
        System.in.read(inputBuffer);

        String inputString = new String(inputBuffer);
        System.out.println("Input String:" + inputString);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input String:");
        String bufferStr = in.readLine();
        System.out.println("Input String:" + bufferStr);

        try {
            in.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
