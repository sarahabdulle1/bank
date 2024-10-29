package org.example.exercise1;

import java.sql.SQLOutput;

public class Animal {
    private int age;
    private String name;
    private String colour;
    public Animal(String name, String colour, int age){
        this.name = name;
        this.colour = colour;
        this.age = age;
    }
    public Animal(String name, String colour){
        this(name, colour, 0);
    }

    //override
    @Override
    public String toString(){
        System.out.println("successful override");
        return "successfully override - String method";
    }
}
