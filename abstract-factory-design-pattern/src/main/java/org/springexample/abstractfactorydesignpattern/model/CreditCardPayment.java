package org.springexample.abstractfactorydesignpattern.model;

public class CreditCardPayment extends PaymentProcessor{
    @Override
    public String processPayment(String amount) {
        return "Processing credit card payment : " + amount;
    }
}
