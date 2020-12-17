package com.javaguru.aleksandrs_drozdovs.lesson_2;

import java.util.Scanner;

public class Task_9 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }

        }
    }
