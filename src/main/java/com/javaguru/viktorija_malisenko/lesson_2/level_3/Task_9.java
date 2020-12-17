package com.javaguru.viktorija_malisenko.lesson_2.level_3;


import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first;
        System.out.println("Enter your number: ");
        first = scn.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(first + "x" + i + "=" + first * i);
        }
        // пока сообразила только так

    }
}
