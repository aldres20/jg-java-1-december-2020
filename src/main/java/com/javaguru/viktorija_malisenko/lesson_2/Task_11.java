package com.javaguru.viktorija_malisenko.lesson_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scn.nextInt();
        System.out.print("Enter second number: ");
        int second = scn.nextInt();
        System.out.print("Enter third number: ");
        int third = scn.nextInt();

        int result = ((first + second + third)/3);
        System.out.println("Result is: " + result);


    }
}
