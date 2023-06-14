package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;


public class GroupOfCards {

    private ArrayList<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card drawCard() {
        if (getSize() > 0) {
            return cards.remove(0);
        }
        return null;
    }
}
