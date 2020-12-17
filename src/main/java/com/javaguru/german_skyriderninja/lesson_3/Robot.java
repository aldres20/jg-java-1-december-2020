package com.javaguru.german_skyriderninja.lesson_3;

//Lesson 3 Tasks

public class Robot {

    private String name;

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public Robot(String robotName) {
        name = robotName;

    }
}

