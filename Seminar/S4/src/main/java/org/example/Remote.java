package org.example;

import java.util.Iterator;

public class Remote implements Iterator<String> {
    private int index;
    protected Tv tv;

    public Remote (Tv tv ){
        index = 0;
        this.tv = tv;
    }

    @Override
    public boolean hasNext() {
        //return (index < tv.getChannels().size() - 1);
        //bad idea: circular? no foreach possible
        return true;
    }

    @Override
    public String next() {
        return tv.channelUp();
    }
}
