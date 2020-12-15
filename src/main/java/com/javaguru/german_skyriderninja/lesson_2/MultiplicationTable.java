package com.javaguru.german_skyriderninja.lesson_2;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
//Task_9
