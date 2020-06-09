package com.kodilla.spring.intro.shape;

public class Triangle /* dla 1.i 2. extends Figure */ implements Shape  {

    @Override
    public String  draw() {
        System.out.println("This is a triangle");
        return "This is a triangle";
    }
}
