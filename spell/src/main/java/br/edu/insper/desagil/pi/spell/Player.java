package br.edu.insper.desagil.pi.spell;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int health;
    private List<Card> cards;

    public Player(int health) {
        this.health = health;
        this.cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void buy(Card card) {
        cards.add(card);
    }

    public void use(int index) {
        cards.remove(index);
    }
}
