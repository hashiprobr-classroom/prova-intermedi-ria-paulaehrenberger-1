package br.edu.insper.desagil.pi.spell;

public class Card {
    private String image;
    private String description;

    public Card(String image, String description) {
        this.image = image;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
