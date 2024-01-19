package org.example.Factory;

import java.util.ArrayList;
import java.util.List;

public class Placinta {

    private List<String> umpluturi = new ArrayList<>();
    private String name;

    public Placinta(String name) {
        this.name = name;
    }

    public void puneBranza() {
        umpluturi.add("Branza");
    }

    public void puneMere() {
        umpluturi.add("Mere");
    }

    public void puneVarza() {
        umpluturi.add("Varza");
    }

    public void puneCartofi() {
        umpluturi.add("Cartofi");
    }
}
