package org.example.Proxy;

import java.util.List;

public class InternetProxy implements Internet{

    private RealInternet realInternet;

    public InternetProxy(RealInternet realInternet) {
        this.realInternet = realInternet;
    }

    List<String> bannedWebsites = List.of("banned.com", "restricted.com");


    @Override
    public void connectToInternet(String website) {
        if("banned.com".equals(website))
            throw new RuntimeException("Not allowed");

        realInternet.connectToInternet(website);

    }
}
