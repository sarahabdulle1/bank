package org.example;

import org.example.cards.Card;
import org.example.cards.Dealer;
import org.example.cards.enums.Rank;
import org.example.cards.enums.Suit;
import org.example.exercise1.Animal;
import org.example.inheritance.Car;
import org.example.inheritance.Ferry;
import org.example.inheritance.Vehicle;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Sarah
        Car bmw = new Car("bmw", 1);
        Ferry titanic = new Ferry("titanic", 2);
        Car tesla = new Car ("tesla", 3);

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(bmw);
        vehicles.add(tesla);
        vehicles.add(titanic);

        for (Vehicle v : vehicles){
            System.out.println(v.repair());
        }


/*
       Card card1 = new Card(Suit.Club, Rank.Ten);
        Dealer dealer = new Dealer(card1);

        Animal dog = new Animal("dog", "white");
        Animal cat = new Animal("cat", "brown", 13);



        String[] names = {"Ali", "Benjamin", "Chloe", "David", "Eniola"};
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(String name : names){
              System.out.println(name);
              sb.append(name);
        }


 */
    }


}














