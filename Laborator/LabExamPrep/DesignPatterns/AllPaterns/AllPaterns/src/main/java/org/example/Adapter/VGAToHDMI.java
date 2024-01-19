package org.example.Adapter;

public class VGAToHDMI implements HDMI {

    VGA vga;

    public VGAToHDMI(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void connect(String connect) {
        vga.connect(connect);
        System.out.println("Adapter converts VGA to HDMI");

    }
}
