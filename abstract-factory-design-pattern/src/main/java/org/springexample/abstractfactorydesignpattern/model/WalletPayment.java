package org.springexample.abstractfactorydesignpattern.model;

public class WalletPayment extends PaymentProcessor{
    @Override
    public String processPayment(String amount) {
        return "Processing wallet payment : " + amount;
    }
}
