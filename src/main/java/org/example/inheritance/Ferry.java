package org.example.inheritance;

public class Ferry extends Vehicle {
    public Ferry(String name, int age){
        super(name, age);
    }
    @Override
    public String repair(){
        return "Your " + this.name + " is being repaired at the dock";
    }
}
