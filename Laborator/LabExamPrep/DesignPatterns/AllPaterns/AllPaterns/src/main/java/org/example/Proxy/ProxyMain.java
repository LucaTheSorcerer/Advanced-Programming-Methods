package org.example.Proxy;

public class ProxyMain {

    public static void main(String[] args) {
        InternetProxy internetProxy = new InternetProxy(new RealInternet());

        internetProxy.connectToInternet("google.com");
        internetProxy.connectToInternet("banned.com");

    }


}
