package com.javaguru.german_skyriderninja.lesson_2;

import java.util.Scanner;

public class CircleRadius {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.println("Please input the radius of circle: ");

        double radius = i.nextDouble();

        System.out.println("Perimeter = " + (2 * radius + Math.PI));
        System.out.println("Area = " + (Math.PI * radius * radius));
    }
}

// И опять работает только с запятой, а ответ даёт с точкой.
//Task_10