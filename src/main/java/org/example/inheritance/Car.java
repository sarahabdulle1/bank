package org.example.inheritance;

public class Car extends Vehicle{
    public Car(String name, int age){
        super(name, age);
    }
    @Override
    public String repair() {
        return "Your " + this.name + " is being repaired at the garage";
    }


}
