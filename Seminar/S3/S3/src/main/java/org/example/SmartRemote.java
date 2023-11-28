package org.example;

import java.util.Iterator;

public class SmartRemote extends Remote {



    public SmartRemote(Tv tv) {
        super(tv);

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
