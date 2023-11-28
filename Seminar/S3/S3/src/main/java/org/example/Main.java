package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //test deck of cards;

        List<PlayingCards> cards = new ArrayList<>();

        Deck deck = new Deck(cards);

        //use the enum

        PlayingCards card1 = new PlayingCards(CardColor.CLOVER, 5);

        PlayingCards card2 = new PlayingCards(CardColor.DIAMONDS, 10);
//        PlayingCards card3 = new PlayingCards(", 2);
//        PlayingCards card4 = new PlayingCards("clover", 7);
//        PlayingCards card5 = new PlayingCards("red", 8);

        deck.addCard(card1);
        deck.addCard(card2);
//        deck.addCard(card3);
//        deck.addCard(card4);
//        deck.addCard(card5);

        //for loop
        for(int i = 0; i < deck.getCard().size(); i++) {
            System.out.println(deck.getCard().get(i).getColor() + " " + deck.getCard().get(i).getValue());
        }

        //use the to string method

        //use the same thing with a for each

        for(PlayingCards card : deck.getCard()) {
            System.out.println(card.toString());
        }

        RemoteFactory rf = new RemoteFactory();

        System.out.println(deck.getCard().toString());

        Tv tv = new Tv("Samsung", List.of("HBO", "MTV", "CNN"));
        Remote basic = rf.createRemote("basic", tv);
        tv.setRemote(basic);

        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();

        System.out.println(tv);

        Remote remote = (Remote) tv.iterator();

        remote.next();
        remote.next();


        Remote smart = rf.createRemote("smart", tv);

        tv.setRemote(smart);

        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();

        System.out.println(tv);



    }
}

