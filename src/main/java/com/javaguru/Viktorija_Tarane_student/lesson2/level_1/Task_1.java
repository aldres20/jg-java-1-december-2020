package com.javaguru.Viktorija_Tarane_student.lesson2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String [] args)
    {   Scanner scan = new Scanner(System.in);
        int a, b, res;
        System.out.print("Enter Two Numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();

        res = a + b;
        System.out.println("Summa = " +res);

        res = a - b;
        System.out.println("Subtraction = " +res);


        res = a * b;
        System.out.println("Multiplication = " +res);

        res = a / b;
        System.out.println("Division = " +res);


    }
}
