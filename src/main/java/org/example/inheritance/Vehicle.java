package org.example.inheritance;

public class Vehicle {
    int age;
    String name;

    public Vehicle(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String repair(){
        return "This " + this.name + " is being repaired";
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
