package com.spl.learntojava;

/**
 *
 */
public class Operator_Simple {
    /**
     *
     * @param argv
     */
    public static void main(String [] argv) {
        // "+" operator
        int result = 1 + 2;
        System.out.println(result);

        // "-" operator
        result = result - 1;
        System.out.println(result);

        // "+" operator
        result = result * 2;
        System.out.println(result);

        // "/" operator
        result = result / 2;
        System.out.println(result);

        // "%" operator
        result = result % 2;
        System.out.println(result);

        // Concat operator
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);

        //
        int i = 3;
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);

        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);

    }
}
