package com.javaguru.german_skyriderninja.lesson_2;

import java.util.Locale;
import java.util.Scanner;

public class OutputDoubles {

    /* Код почему-то работает только когда вводишь числа с запятой, но НЕ с точкой. Хоть и ответ даёт числа с точкой
    вместо запятых. Я если честно не понял в чём причина, перерыл разные ресурсы и вроде всё нормально.
    Итог устал - иду спать*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);//Добавил локаль. Джава использовала настройки моей винды и принимала за разделение только запятые, а не точки.

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();

        double sum =  num1 +  num2;
        double distract =  num1 -  num2;
        double product =  num1 *  num2;
        double divide =  num1 /  num2;

        System.out.println("DoubleSum Output: " +sum);
        System.out.println("DoubleDistract Output: " +distract);
        System.out.println("DoubleProduct Output: " +product);
        System.out.println("DoubleDivide Output: " +divide);


    }
}
//Task_2
