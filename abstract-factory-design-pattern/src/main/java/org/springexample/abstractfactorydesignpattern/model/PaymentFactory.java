package org.springexample.abstractfactorydesignpattern.model;

public interface PaymentFactory {
    PaymentProcessor createPaymentProcessor();
}
