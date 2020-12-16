package com.javaguru.viktorija_malisenko.lesson_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second, result;
        System.out.println("first num: ");
        first = scanner.nextDouble();
        System.out.println("second num: ");
        second = scanner.nextDouble();
        result = first + second;
        System.out.println("result is - " + result);

        result = first - second;
        System.out.println("result is - " + result);

        result = first / second;
        System.out.println("result is - " + result);

        result = first * second;
        System.out.println("result is - " + result);

    }

}
