package com.kodilla.spring.intro.shape;

public class Circle  /* dla 1.i 2. extends Figure */ implements Shape  {
    @Override
    public String  draw() {
        System.out.println("This is a circle");
        return "This is a circle";
    }
}