package com.javaguru.aleksandrs_drozdovs.lesson_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        Double num1 = input.nextDouble();
        System.out.println("Please enter the second number : ");
        Double num2 = input.nextDouble();
        System.out.println("Please enter the third number : ");
        Double num3 = input.nextDouble();
        System.out.println("Average number is : " + (num1 + num2 + num3)/3);

    }
}
