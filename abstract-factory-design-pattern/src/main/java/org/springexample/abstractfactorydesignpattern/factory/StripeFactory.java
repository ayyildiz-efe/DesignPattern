package org.springexample.abstractfactorydesignpattern.factory;

import org.springexample.abstractfactorydesignpattern.model.CreditCardPayment;
import org.springexample.abstractfactorydesignpattern.model.PaymentFactory;
import org.springexample.abstractfactorydesignpattern.model.PaymentProcessor;

public class StripeFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardPayment();
    }
}
