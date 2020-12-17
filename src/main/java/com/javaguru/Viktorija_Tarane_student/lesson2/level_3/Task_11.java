package com.javaguru.Viktorija_Tarane_student.lesson2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a, b, c, d, res;
        System.out.print("Please enter three numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = a + b + c;
        res= d/3;
        System.out.println("Average = " +res);
    }
}
