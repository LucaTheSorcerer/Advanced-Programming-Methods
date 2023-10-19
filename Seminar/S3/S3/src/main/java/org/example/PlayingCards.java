package org.example;

public class PlayingCards {
    private CardColor color;
    private int value;

    public PlayingCards(CardColor color, int value) {
        this.color = color;
        this.value = value;
    }

    public void setColor(String color) {
        this.color = CardColor.valueOf(color.toUpperCase());
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color.toString();
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PlayingCards{" +
                "color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}
