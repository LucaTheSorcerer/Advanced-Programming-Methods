package org.example.Adapter;

public class VGAAdaptee implements VGA{

    @Override
    public void connect(String connect) {
        System.out.println("Connecting to: " + connect + " with vga");
    }
}
