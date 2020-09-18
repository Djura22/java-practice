package com.lads;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // primitive types
        byte myAge = 30;
        byte herAge = myAge;
        int viewsCount = 123_456_789;      // Integers are given size limits based on how they are defined
        long viewsCounter = 3_123_456_789L;       // byte - int - long
        float price = 10.99F;                // long and floats require L or F to define

        char letter = 'A';
        boolean isEligible = true;
        System.out.println(viewsCount);
        System.out.println("\n");

        // reference types
        Date now = new Date();
        System.out.println(now); // Fri Sep 18 14:23:30 BST 2020
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); // java.awt.Point[x=2,y=1]
        System.out.println("\n");

        // Strings
        String message = "  Hello World" + "!!";
        System.out.println(message.endsWith("!!")); // true
        System.out.println(message.length()); // 15
        System.out.println(message.indexOf("H")); // 2
        System.out.println(message.replace("!", "*")); // __Hello World**
        System.out.println(message.trim()); // Hello World!!
        System.out.println("\n");

        // Arrays
        int[] numbers = new int[5];
        int[] numeros = { 2, 3, 4, 5, 1, 4 };
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // [I@58372a00
        System.out.println(numeros.length); // 6
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]
        System.out.println("\n");

        // Multi-Dimensional Arrays
        // int[][] numbas = new int[2][3];
        int[][] numbas = { { 0, 0, 0}, { 0, 0, 0} };
        numbas[0][0] = 1;
        numbas[1][1] = 8;
        System.out.println(Arrays.toString(numbas)); // [[I@4dd8dc3, [I@6d03e736]
        System.out.println(Arrays.deepToString(numbas)); // [[1, 0, 0], [0, 8, 0]]
        System.out.println("\n");

        // Constants
        final float PI = 3.14F; // Constants should be all in caps
        PI = 3; // Error - cannot change a constant

    }

}
