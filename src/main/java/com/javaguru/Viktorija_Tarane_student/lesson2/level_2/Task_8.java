package com.javaguru.Viktorija_Tarane_student.lesson2.level_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя пользователя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }
}
