package org.example;

import java.util.Iterator;
import java.util.List;

public class Tv implements Iterable<String>{
    private String brand;
    private List<String> channels;

    private int index;

    private Remote remote;

    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                    ", current channel=" + channels.get(index) +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public Tv(String brand, List<String> channels) {
        this.brand = brand;
        this.channels = channels;
        this.index = 0;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public String channelUp() {
        index += 1;

        if (index > channels.size() - 1)
            index = 0;

        return channels.get(index);
    }

    public String channelDown() {
        //if (index > 0)
        index -= 1;

        if (index < 0)
            index = channels.size() - 1;

        return channels.get(index);
    }

    @Override
    public Iterator<String> iterator() {
        return remote;
    }
}
