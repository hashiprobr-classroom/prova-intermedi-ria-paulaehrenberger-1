package br.edu.insper.desagil.pi.spell;

import java.util.Map;

public abstract class Spell extends ColorCard {
    public Spell(String image, String description, int color, Map<Boolean, Integer> cost) {
        super(image, description, color, cost);
    }

    public abstract String quote();
}
