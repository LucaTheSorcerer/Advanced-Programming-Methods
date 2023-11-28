package org.example;

public class User {

    public static void main(String[] args) {

        Computer computer = new Computer();
        HDMIMonitor hdmiMonitor = new HDMIMonitor();

        VGAToHDMIAdapter adapter = new VGAToHDMIAdapter(hdmiMonitor);

        adapter.connectVGA();
    }
}
