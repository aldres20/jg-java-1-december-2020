package com.javaguru.Viktorija_Tarane_student.lesson2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input radius of circle: " );
        Double radius = scan.nextDouble();
        System.out.print("Area of circle: " + (radius * radius) * 3.1415) ;
        System.out.print("Perimeter is :" + 2 * 3.1415 * radius);

    }
}
