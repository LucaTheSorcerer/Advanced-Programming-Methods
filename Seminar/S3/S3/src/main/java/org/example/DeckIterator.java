package org.example;

import java.util.Iterator;

public class DeckIterator implements Iterator<PlayingCards> {

    private int index;
    private Deck deck;

    public DeckIterator(Deck playingCards) {
        this.index = 0;
        this.deck = playingCards;
    }


    @Override
    public boolean hasNext() {
        //returns false if we are at the end
        return index < deck.getCard().size();

    }

    @Override
    public PlayingCards next() {

        //returns the next element in the iteration
        if(hasNext()) {
            return deck.getCard().get(index++);
        } else {
            throw new IndexOutOfBoundsException("No more cards in the deck");
        }
    }
}
