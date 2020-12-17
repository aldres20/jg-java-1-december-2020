package com.javaguru.viktorija_malisenko.lesson_2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int first, second, result;
        System.out.print("First number: ");
        first = scn.nextInt();
        System.out.print("Second number: ");
        second = scn.nextInt();

        result = first + second;
        System.out.println("Result is: " + result);

        result = first - second;
        System.out.println("Result is: " + result);

        result = first * second;
        System.out.println("Result is: " + result);

        result = first / second;
        System.out.println("Result is: " + result);

    }

}
