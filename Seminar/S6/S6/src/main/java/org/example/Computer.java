package org.example;

public class Computer implements VGAPort{

    @Override
    public void connectVGA() {
        System.out.println("VGA connected");
    }
}
