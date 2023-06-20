/*
Group - 5
This code is for Black Jack game
@authors : Karanveer Singh 
*/

package ca.sheridancollege.project;

import java.util.ArrayList;

// thsi is class for BlackJack game
public class BlackJackGame {

    // variable of this clss
    private final String name;
    private ArrayList<Player> players;
    private GroupOfCards deck;

    //constructor
    public BlackJackGame(String name) {
        this.name = name;
        players = new ArrayList<>();
        deck = new GroupOfCards();
    }

    //getter
    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    //function which deals with initialCards
    public void dealInitialCards() {
        for (Player member : players) {
            Card card1 = deck.drawCard();
            Card card2 = deck.drawCard();
            member.addCard(card1);
            member.addCard(card2);
        }
    }

    public void play() {
    }

    public void declareWinner() {
    }
}
