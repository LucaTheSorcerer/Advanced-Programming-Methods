package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Deck implements Iterable<PlayingCards> {

    private List<PlayingCards> cards;

    @Override
    public Iterator<PlayingCards> iterator() {
        return new DeckIterator(this);
    }

    @Override
    public void forEach(Consumer<? super PlayingCards> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<PlayingCards> spliterator() {
        return Iterable.super.spliterator();
    }

    public Deck(List<PlayingCards> cards) {
        this.cards = cards;
    }


    public void addCard(PlayingCards card) {
        cards.add(card);
    }

    public List<PlayingCards> getCard() {
        return cards;
    }

    public Iterable<PlayingCards> getIterable() {
        return cards;
    }
}
