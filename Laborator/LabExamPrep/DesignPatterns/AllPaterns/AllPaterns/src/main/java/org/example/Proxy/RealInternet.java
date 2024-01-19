package org.example.Proxy;

public class RealInternet implements Internet {

    @Override
    public void connectToInternet(String website) {
        System.out.println("Connecting to: " + website);
    }
}
