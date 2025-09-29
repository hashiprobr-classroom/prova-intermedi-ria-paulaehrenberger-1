package br.edu.insper.desagil.pi.spell;

public class Artifact extends Card {
    private int cost;

    public Artifact(String image, String description, int cost) {
        super(image, description);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
