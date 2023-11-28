package org.example;

import java.util.Iterator;
import java.util.Objects;

public class RemoteFactory {

    public Remote createRemote(String type, Tv tv) {
         if(type.equals("basic"))
             return new Remote(tv);
         if(type.equals("smart"))
             return new SmartRemote(tv);
        return null;
    }
}
