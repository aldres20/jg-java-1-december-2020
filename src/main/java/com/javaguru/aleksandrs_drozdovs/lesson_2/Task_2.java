package com.javaguru.aleksandrs_drozdovs.lesson_2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double a = input.nextDouble();
        System.out.println("Input the second number: ");
        double b = input.nextDouble();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));


    }
}