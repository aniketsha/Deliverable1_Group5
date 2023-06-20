package ca.sheridancollege.project;


public class Card extends GroupOfCards {

    //private variables 
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //getters for private variables
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    //overriding the toString method
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
