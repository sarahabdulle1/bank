package org.example.cards;

import org.example.cards.enums.Rank;
import org.example.cards.enums.Suit;

public class Card {
    Rank rank;
    Suit suit;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

}
