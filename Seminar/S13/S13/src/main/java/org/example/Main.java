package org.example;

import org.example.Builder.TestBuilder;

public class Main {
    public static void main(String[] args) {

//        DPRCIVProxy dprcivProxy= new DPRCIVProxy();
//
//        dprcivProxy.registerPlate("abc");
//        dprcivProxy.registerPlate("abcxxx");
//
//          PayRON payRON = new PayRON();
//
//          PayHUFAdapter payHUFAdapter = new PayHUFAdapter(payRON);
//
//          payHUFAdapter.pay(100);
//          payRON.pay(100);

        /**
         * BUILDER PATTERN
         */

        TestBuilder testBuilder = new TestBuilder();
        testBuilder.test("Basic Int test").expectedValue(5).result(5).build().run();

    }
}