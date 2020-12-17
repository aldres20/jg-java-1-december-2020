package com.javaguru.Viktorija_Tarane_student.lesson2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a first number: ");
        double firstDoubleNumber = scan.nextDouble();
        System.out.print("Input a second number: ");
        double secondDoubleNumber = scan.nextDouble();

        double summa = firstDoubleNumber + secondDoubleNumber;
        System.out.print("Sum: "+ summa);

        double subtraction = firstDoubleNumber - secondDoubleNumber;
        System.out.print("Sub: "+ subtraction);

        double division = firstDoubleNumber / secondDoubleNumber;
        System.out.print("Div: "+ division);

        double multiplication = firstDoubleNumber * secondDoubleNumber;
        System.out.print("Mult: "+ multiplication);



    }
}



