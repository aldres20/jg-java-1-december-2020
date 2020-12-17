package com.javaguru.viktorija_malisenko.lesson_2.super_task;

import java.util.Scanner; //* Имортировали новый java class Scanner *//

public class Super_task_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Объявляем переменные first, second, result //
        int first, second, result;
        System.out.print("First number is ");
        first = scn.nextInt();
        System.out.print("Second number is ");
        second = scn.nextInt();
        result = first + second;
        System.out.print("Result is " + result);
    }
}

     /* *
        * Данной программой просим пользователя ввести 2 произвольных целых числа,
        * программа в свою очередь считает сумму этих чисел
        */
