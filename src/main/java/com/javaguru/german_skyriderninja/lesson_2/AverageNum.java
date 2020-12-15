package com.javaguru.german_skyriderninja.lesson_2;

import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReviewComment(teacher = "Можно посмотреть как будет работать с типом данных double (дробные)")
public class AverageNum {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Pleas enter the amount of numbers you want to count average from: ");

        double numberAmount = Double.parseDouble(num.nextLine());
        int sum = 0;

        for(int i = 1; i <= numberAmount; i++){
            System.out.print("Number"+ i +" :");
            sum += Double.parseDouble(num.nextLine());
        }

        double average = sum / numberAmount;
        System.out.println("The average of " +numberAmount+ " entered number(s) is " +average);
    }
}
//Дополнено 21:52 - Вот так вот выглядит с Double
//Task_11