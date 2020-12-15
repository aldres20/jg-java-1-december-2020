package com.javaguru.german_skyriderninja.lesson_2;

import java.util.Scanner;

public class OutputSums {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        scan.close();

        int sum = num1 + num2;
        int distract = num1 - num2;
        int product = num1 * num2;
        int divide = num1 / num2;

        System.out.println("Sum Output: " +sum);
        System.out.println("Distract Output: " +distract);
        System.out.println("Product Output: " +product);
        System.out.println("Divide Output: " +divide);

        /* Возможно есть иное решение этой задачи, без приминения библиотеки, но это не точно. =) */
    }
}//Task_1
