package org.example.Adapter;

public class Main {

    public static void main(String[] args) {
        VGAAdaptee vgaAdaptee = new VGAAdaptee();


        VGAToHDMI vgaToHDMI = new VGAToHDMI(vgaAdaptee);

        vgaToHDMI.connect("Monitor");

        vgaAdaptee.connect("Monitor");

    }
}
