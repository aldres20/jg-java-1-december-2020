package com.javaguru.german_skyriderninja.lesson_2;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your user name: ");

        String username = input.next();

        System.out.println();
        System.out.println("Hello " +username);
    }
}//Task_8
