package ca.sheridancollege.project;

import java.util.ArrayList;


public class Game {

    private final String name;
    private ArrayList<Player> players;
    private GroupOfCards deck;

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
        deck = new GroupOfCards();
    }

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

    public void dealInitialCards() {
        for (Player player : players) {
            Card card1 = deck.drawCard();
            Card card2 = deck.drawCard();
            player.addCard(card1);
            player.addCard(card2);
        }
    }

    public void play() {
    }

    public void declareWinner() {
    }
}
