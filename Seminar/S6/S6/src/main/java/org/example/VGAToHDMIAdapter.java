package org.example;

public class VGAToHDMIAdapter implements VGAPort{

    private HDMIMonitor hdmiMonitor;

    public VGAToHDMIAdapter(HDMIMonitor hdmiMonitor) {
        this.hdmiMonitor = hdmiMonitor;
    }

    @Override
    public void connectVGA() {
        System.out.println("VGA adapted to HDMI");
        hdmiMonitor.connectHDMI();
    }
}
