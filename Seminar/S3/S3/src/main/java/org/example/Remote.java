package org.example;

import java.util.Iterator;

public class Remote implements Iterator<String> {


    int index;
    protected Tv tv;



    public Remote(Tv tv) {
        this.index = 0;
        this.tv = tv;
    }

    public Tv getTv() {
        return tv;
    }

    @Override
    public boolean hasNext() {
//        return (index < tv.getChannels().size() - 1);
        return true;
    }

    @Override
    public String next() {

        if(hasNext()) {
            return tv.channelUp();
        } else {
            throw new IndexOutOfBoundsException("No more channels");
        }
    }
}
