package com.javaguru.german_skyriderninja.lesson_3;

//Lesson 3 Tasks
//Альтернативнй вариант.

public class RobotDemoV2 {
    public static void main(String[] args) {
        RobotV2 chappie = new RobotV2("Hello!","My name is Chappie!");
        System.out.print(chappie.greeting);
        System.out.println(chappie.name);

        RobotV2 manny = new RobotV2("Greetings Hooman!","And my name is Manny!");
        System.out.print(manny.greeting);
        System.out.println(manny.name);

        RobotV2 dyson = new RobotV2("Hi there!","Dyson, nice to meet you human.");
        System.out.print(dyson.greeting);
        System.out.println(dyson.name);
    }
}

