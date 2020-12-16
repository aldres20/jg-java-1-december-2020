package com.javaguru.aleksandrs_drozdovs.lesson_2;

import java.util.Scanner;

public class Task_10 {

    public static void  main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first number: ");
        Double radius = input.nextDouble();
        System.out.println("Perimeter is : " + 2 * radius * Math.PI );
        System.out.println("Area is : " + Math.pow(radius,2) * Math.PI );

    }
}
