package org.example.Adapter;

public class PayHUFAdapter implements ConversionCurrency{

    private Pay adaptee;

    public PayHUFAdapter(Pay adaptee) {
        this.adaptee = adaptee;
    }

    public int convertToHUF(int amount) {
        return amount * 1000;
    }

    @Override
    public void pay(int amount) {
        adaptee.pay(convertToHUF(amount));
    }
}
