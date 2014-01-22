package io.mercer.dp.flyweight;

public class Monster implements Creature {

    private String vocalization;

    public Monster(String vocalization) {
        this.vocalization = vocalization;
    }

    @Override
    public String vocalize() {
        return vocalization + "!";
    }
}
