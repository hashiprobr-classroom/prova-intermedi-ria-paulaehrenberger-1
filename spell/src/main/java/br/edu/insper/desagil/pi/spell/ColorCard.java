package br.edu.insper.desagil.pi.spell;

import java.util.Map;

public class ColorCard extends Card {
    private int color;
    private Map<Boolean, Integer> cost;

    public ColorCard(String image, String description, int color, Map<Boolean, Integer> cost) {
        super(image, description);
        this.color = color;
        this.cost = cost;
    }

    public Map<Boolean, Integer> getCost() {
        return cost;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String colorName() {
        switch (color) {
            case 1:
                return "Red";
            case 2:
                return "Green";
            case 3:
                return "Blue";
            case 4:
                return "Black";
            case 5:
                return "White";
            default:
                throw new IllegalStateException("invalid color");
        }
    }
}
