package com.javaguru.german_skyriderninja.lesson_2;

import java.util.Scanner;

public class AverageNum {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Pleas enter the amount of numbers you want to count average from: ");

        int numberAmount = Integer.parseInt(num.nextLine());
        int sum = 0;

        for(int i = 1; i <= numberAmount; i++){
            System.out.print("Number"+ i +" :");
            sum += Integer.parseInt(num.nextLine());
        }

        int average = sum / numberAmount;
        System.out.println("The average of " +numberAmount+ " entered number(s) is " +average);
    }
}
//Task_11