package com.javaguru.viktorija_malisenko.lesson_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        double radius, perimeter;
        double P = 3.14;
        Scanner scn = new Scanner(System.in);
        System.out.print("Radius is = ");
        radius = scn.nextDouble();

        perimeter = 2 * P * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + P * Math.pow(radius, 2));

    }
}
