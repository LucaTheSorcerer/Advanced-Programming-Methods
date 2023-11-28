package org.example;

import java.util.Iterator;
import java.util.List;

public class Tv {

    private String brand;
    private List<String> channels;

    private  Remote remote;

    private int index;

    public Tv(String brand, List<String> channels) {
        this.brand = brand;
        this.channels = channels;
    }

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

    public String channelUp() {
        index += 1;

        if(index > channels.size() - 1)
            index = 0;

        return channels.get(index);
    }

    public String channelDown() {
        System.out.println("Channel down");

        //implement in a cycle manner

        index -= 1;

        if(index < 0)
            index = channels.size() - 1;

        return channels.get(index);
    }

    public Iterator<String> iterator() {
        return new Remote(this);
    }



    //create remotes at runtime

//    public Remote getRemote() {
//        return remote;
//    }
//
    public void setRemote(Remote remote) {
        this.remote = remote;
    }
//
//    public void setRemote(String type) {
//        if(type.equals("basic"))
//            this.remote = new Remote(this);
//        if(type.equals("smart"))
//            this.remote = new SmartRemote(this);
//    }


}
