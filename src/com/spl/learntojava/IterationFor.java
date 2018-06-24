/*
 * Class Name : IterationFor.java
 * Version Info : 0.0.1
 * Created Date : 2018-06-19
 * Last Modify Date : 2018-06-19
 * Copyright (c) : SPL
 * All right reserved
 * */

package com.spl.learntojava;

import java.awt.*;

public class IterationFor {
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            System.out.print("#");
        }
        System.out.println();

        System.out.println();
        for(int i=0;i<10;i++) {
            for(int j=10;j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        String[] arr = new String[10];
        int[] index = new int[10];

        for(int i=0; i<arr.length;i++) {
            int a = (int) ((Math.random() * 10) + 1);
            index[i] = a;
            arr[i] = "Random Number : " + a;
        }

        for(String str : arr) {
            System.out.println(str);
        }

        String[] classGroup = { "최진혁", "최유빈", "한아람"};
        for(String str : classGroup) {

            System.out.println(str);
        }

        for(int i=0; i < classGroup.length; i++) {
            String member = classGroup[i];
            System.out.println(member + "가 상담을 받았습니다.");
        }



   }

}
